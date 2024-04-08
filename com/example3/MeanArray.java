package com.example3;

class MeanArray {
	public static double Mean(int[] arr, int n) {
		if (n == 0)
			return 0.0;
		return (Mean(arr, n - 1) * (n - 1) + arr[n - 1]) / n;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5 };
		System.out.println("the mean of the array is " + Mean(arr, arr.length));
	}
}