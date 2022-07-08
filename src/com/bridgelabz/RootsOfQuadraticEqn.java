package com.bridgelabz;

import java.util.Scanner;

public class RootsOfQuadraticEqn {
	public static void Roots (int a, int b, int c) {
		double delta = (b*b)-(4*a*c);
		double d,x,y;
		//used if for complex roots
		if(delta<0) {
			d = -delta;
			x = -b/(2*a);
			y = Math.sqrt(d)/(2*a);		
			System.out.println("Root 1 = "+x+"+"+y+"i");
			System.out.println("Root 2 = "+x+"-"+y+"i");
			return;
		}
		double root1 = (-b + Math.sqrt(delta))/(2*a);
		double root2 = (-b - Math.sqrt(delta))/(2*a);
		System.out.println("The roots are "+root1+" and "+root2);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the coefficient of x*x, x and constant");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		Roots(a,b,c);		
	}
}
