package javaClass;

import java.util.Scanner;

public class TD2sum {
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	System.out.println("enter the value of n:");
	int n,i,j,k;
	n=x.nextInt();
	int s[][]=new int[3][3];
	int s1[][]=new int[3][3];
	int s2[][]=new int[3][3];
	System.out.println("enter the matrix array elements:");
	for(i=0;i<n;i++) {
		for(j=0;j<n;j++) {
			s[i][j]=x.nextInt();
		}
	}
	System.out.println("the matrix array elements are:");
	for(i=0;i<n;i++) {
		for(j=0;j<n;j++) {
			System.out.print(s[i][j]+" ");
			System.out.print(" ");
		}
		System.out.print("\n");
		}
	System.out.println("enter the matrix array elements:");
	for(i=0;i<n;i++) {
		for(j=0;j<n;j++) {
			s1[i][j]=x.nextInt();

		}
	}
	System.out.println("the matrix array elements are:");
	for(i=0;i<n;i++) {
		for(j=0;j<n;j++) {
			System.out.print(s1[i][j]+" ");
			System.out.print(" ");
		}
		System.out.print("\n");
		}
	for(i=0;i<n;i++) {
		for(j=0;j<n;j++) {
			s2[i][j]=s[i][j]+s1[i][j];
		}
		
		//n
	}
	for(i=0;i<n;i++) {
		for(j=0;j<n;j++) {
			System.out.print(s2[i][j]+" ");
		}
		System.out.print("\n");
		}
	
	}
}
