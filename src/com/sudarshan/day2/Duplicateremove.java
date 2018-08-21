package com.sudarshan.day2;

public class Duplicateremove {

	public static String removeDuplicate(String string) {
		StringBuffer newString = new StringBuffer();
		for (int i = 0; i < string.length(); i++) {
			Boolean found = false;
			for (int j = 0; j < newString.length(); j++) {
				if (string.charAt(i) == newString.charAt(j)) {
					found = true;
					break;
				}
			}
			if (found == false) {
				newString.append(String.valueOf(string.charAt(i))); //= newString + String.valueOf(string.charAt(i));
			}
		}
		System.out.println(newString);
		return newString.toString();
	}

}
