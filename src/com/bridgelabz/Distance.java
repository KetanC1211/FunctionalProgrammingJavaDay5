package com.bridgelabz;
import java.util.Scanner;

public class Distance {
	
	public static double Squareroot(int x, int y) {
		double distance = Math.sqrt(x*x+y*y);
		return distance;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the co-ordinate (x,y) = ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		System.out.println("Distance from origin is "+Squareroot(x,y));		
	}
}
