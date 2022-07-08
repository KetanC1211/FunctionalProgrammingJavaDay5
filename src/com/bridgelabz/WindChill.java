package com.bridgelabz;

import java.util.Scanner;

public class WindChill {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of temperature in Fahrenheit");
		double t = sc.nextInt();;
		System.out.println("Enter the wind speed");
		double v = sc.nextInt();
		if(t<50&&v>3&&v<120) {	
			double w = 35.74 + 0.6215*t +((0.4275*t)-35.75)*(Math.pow(v, 0.16));
			System.out.println("Effective temperature is "+w);
		}
		else {
			System.out.println("Enter input in proper range");
		}
		
	}
}