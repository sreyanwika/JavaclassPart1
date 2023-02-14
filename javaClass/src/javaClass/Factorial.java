package javaClass;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// finding the factorial of the n ..(prob2)
		Scanner x=new Scanner(System.in);
		System.out.println("enter d value of n:");
		int n=x.nextInt();
		int fact=1,i;
		for(i=1;i<=n;i++) {
			fact=fact*i;
		}
		System.out.println("the factorial of the value n:"+fact);
	}

}
