package com.sudarshan.day2;

public class CUI {

	public static String USERNAME = "user";
	public static String PASSWORD = "pass";
	
	public static Boolean validateUser(String userName, String password) {
		if (userName.equals(USERNAME) && password.equals(PASSWORD)) {
			System.out.println("Welcome " + userName);
			return true;
		}
		return false;
	}

}
