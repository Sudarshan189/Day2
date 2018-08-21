package com.sudarshan.day2;

public class Amstrong {

	// function for Armstrong
	public static Boolean amstrongCheck(int number) {
		// TODO Auto-generated method stub
		System.out.println(number);
		int originalNumber = number;
		int cubeSum = 0;
		while (number != 0) {
			int remainder = number % 10;
			cubeSum = cubeSum + remainder * remainder * remainder;
			number = number / 10;
		}
		if (cubeSum == originalNumber) {
			return true;
		} else {
			return false;
		}
	}

}
