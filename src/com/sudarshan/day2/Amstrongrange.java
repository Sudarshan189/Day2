package com.sudarshan.day2;

public class Amstrongrange {

	public static int[] amstrongCheck(int start, int end) {
		// TODO Auto-generated method stub
		int index = 0;
		int[] amstrongArray = new int[10];
		int originalNumber;
		int remainder;
		int number;
		int cubeSum = 0;
		for (int i = start; i < end; i++) {
			originalNumber = i;
			number = originalNumber;
			cubeSum = 0;
			while (number != 0) {
				remainder = number % 10;
				cubeSum = cubeSum + remainder * remainder * remainder;
				number = number / 10;
			}
			if (cubeSum == originalNumber) {
				amstrongArray[index++] = cubeSum;
			}
		}
		return amstrongArray;
	}

}
