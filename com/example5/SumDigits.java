package com.example5;

class SumDigits{ 
public static int Sum(int n){ 
if(n==0)return 0; 
return Sum(n/10)+n%10; 
} 
public static void main(String[]args){ 
int n=1234; 
System.out.println("the sum of digits of no "+n+" is "+Sum(n)); 
}} 