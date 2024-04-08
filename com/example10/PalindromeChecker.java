package com.example10;


import java.util.*; 
class PrintFibonacciReverse{ 
public static List<Integer>list=new ArrayList<>(); 
public static List<Integer> printFib(int n){ 
if(n==1){list.add(0);return list;} 
if(n==2){list.add(0);list.add(1);return list;} 
List<Integer>result=printFib(n-1); 
int fLast=result.get(result.size()-1); 
int sLast=result.get(result.size()-2); 
int last=fLast+sLast; 
if(last<n){ 
 
 
result.add(last); 
} 
return result; 
 
 
} 
public static void printReverse(List<Integer>list){ 
if(list.size()==0)return; 
Integer val=list.get(0); 
list.remove(val); 
printReverse(list); 
System.out.print(val+" "); 
 
} 
}