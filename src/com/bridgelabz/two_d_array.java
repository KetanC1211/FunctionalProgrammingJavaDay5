package com.bridgelabz;

import java.util.Scanner;

public class two_d_array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n and m");
		int n = sc.nextInt();
		int m = sc.nextInt();
		int array[][]= new int [n][m];
		int i,j;
		System.out.println("Enter the value in Array");
		for(i=0;i<n;i++) {
			for(j=0;j<m;j++) {
				array[i][j] = sc.nextInt();
			}
			System.out.println();
		}
		System.out.println("Printing the values of Array");
		for(i=0;i<n;i++) {
			for(j=0;j<m;j++) {
				System.out.print(array[i][j]); 
			}
			System.out.println();
		}
	}
}
