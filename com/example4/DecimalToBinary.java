package com.example4;

class DecimalToBinary {
	public static int Binary(int n) {
		if (n == 0)
			return 0;
		return Binary(n / 2) * 10 + n % 2;
	}

	public static void main(String[] args) {
		int n = 10;
		System.out.println("the binary conversion of " + n + " is " + Binary(n));
	}
}