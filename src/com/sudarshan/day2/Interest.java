package com.sudarshan.day2;

public class Interest {

	public static float simpleInterest(float principal, float rateOfInterest, int timeInYears) {
		float simpleInterest = (principal * rateOfInterest * timeInYears) / 100;
		System.out.println("Simple Interest = " + simpleInterest);
		return simpleInterest;
	}

	public static double compoundInterest(float principal, float rateOfInterest, int timeInYears) {
		float ans1 = 1 + (rateOfInterest / 100);
		double compoundInterest = Math.pow(ans1, timeInYears);
		compoundInterest = compoundInterest * principal;
		System.out.println("Compound Interest = " + compoundInterest);
		return compoundInterest;
	}

//	private static Boolean validateData(float principal, float rateOfInterest, int timeInYears) {
//		if (principal <= 0 && rateOfInterest <= 0 && timeInYears <= 0) {
//			return false;
//		}
//		return true;
//	}

}
