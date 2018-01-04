package com.challenge;

import java.util.logging.Logger;
import java.util.regex.Matcher; //Added comments
import java.util.regex.Pattern;

public class Decode {

	private Decode() {

	}

	public static String decode(String source) {
		StringBuilder dest = new StringBuilder();
		Pattern pattern = Pattern.compile("[0-9]+|[a-zA-Z]");
		Matcher matcher = pattern.matcher(source);
		while (matcher.find()) {
			int number = Integer.parseInt(matcher.group());
			matcher.find();
			while (number-- != 0) {
				dest.append(matcher.group());
			}
		}
		return dest.toString();
	}

	public static void main(String[] args) {
		Logger l = Logger.getLogger("Decoded");
		String str = "3a2b1c";
		String decoded = decode(str);
		l.info(decoded);

	}

}
