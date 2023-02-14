package javaClass;

import java.util.Scanner;

public class PrimeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner x=new Scanner(System.in);
		System.out.println("enter the value of n:");
		int n,i,f=1,j;
		n=x.nextInt();
		int x1[]=new int[10];
		System.out.println("enter the array elements:");
		for(i=0;i<n;i++) {
			x1[i]=x.nextInt();
		}
		for(i=0;i<n;i++) {
			for(j=2;j<n;j++) {
				if (x1[i]%j==0) {
					f=0;
				}
			if(f==0) {
				System.out.println("the numb is not prime"+x1[i]);
			}
			else if(f==1) {
				System.out.println("the num is prime"+x1[i]);
			}
			}
			
		}
	}

}
