package com.challenge;

import java.util.logging.Logger;

public class Compress {
	private Compress(){
		
	}
	public static void main(String[] args) throws Exception {
		Logger l = Logger.getLogger("Compress.java");
		String str = "aaabbc"; // initialize the string
		int count = 1; // to count
		String res = "";
		for (int i = 0; i < str.length(); i++) { // for loop to start counting
													// and checking the alphabet
			if (str.charAt(i) == str.charAt(i + 1)) {
				count++;
			} else {
				res = res + count + str.charAt(i);
				count = 1;
			}
		}
		l.info("Result is:" + res); // to print the result
	}
}
