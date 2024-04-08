package com.example8;

class SumArray{ 
public static int Sum(int []arr,int n){ 
if(n==0){return 0;} 
int sSum=Sum(arr,n-1); 
return sSum+arr[n-1]; 
} 
public static void main(String[]args){ 
int arr[]={1,2,3,4,5}; 
System.out.println("the sum of the array is "+Sum(arr,arr.length)); 
 
 
}} 