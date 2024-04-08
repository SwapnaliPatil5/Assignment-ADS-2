package com.example9;


import java.util.Scanner; 
class PrintFibonacciReverse{ 
public static boolean isPalindrome(String input){ 
if(input.length()==0 || input.length()==1){return true;} 
if(input.charAt(0)!=input.charAt(input.length()-1)){ 
return false;} 
return isPalindrome(input.substring(1,input.length()-1)); 
} 
public static void main(String[]args){ 
Scanner sc=new Scanner(System.in); 
String str=sc.next(); 
if(isPalindrome(str)){ 
System.out.println(str + " is palindrome " );} 
else{ 
System.out.println(str + " is not palindrome " ); 
} 
}} 