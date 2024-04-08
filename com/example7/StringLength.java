package com.example7;

class StringLength {
	public static int Length(String str) {
		if (str.length() == 0) {
			return 0;
		}
		return Length(str.substring(1)) + 1;
	}

	public static void main(String[] args) {

		String str = "swapnali";
		System.out.println("the length of " + str + " is " + Length(str));
	}
}