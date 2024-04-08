package com.example6;

class StringReverse {
	public static String Reverse(String input) {
		if (input.length() == 0 || input.length() == 1) {
			return input;
		}
		return Reverse(input.substring(1)) + input.charAt(0);
	}

	public static void main(String[] args) {
		String str = "swapnali";
		System.out.println("the rev of " + str + "is " + Reverse(str));
	}
}