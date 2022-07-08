package com.bridgelabz;
import java.util.Scanner;

public class Sum_of_three_equallsZero {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of N");
		int n = sc.nextInt();
		int i,j,k,counter=0;
		int a[] = new int[n]; 
		for(i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}

		for(i=0;i<n;i++) {
			for(j=0;j<n;j++) {
				for(k=0;k<n;k++) {
					if(a[i]+a[j]+a[k]==0) {
						System.out.println("("+a[i]+","+a[j]+","+a[k]+") is the required triplet");
						counter++;
					}
				}
			}
		}
		System.out.println("There are" +counter+"distinct triplets");
	}

}
