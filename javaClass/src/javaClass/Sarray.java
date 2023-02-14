package javaClass;

import java.util.Scanner;

public class Sarray {
	//finding the sum of array elements...

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner x=new Scanner(System.in);
		System.out.println("enter the value of n:");
		int n,i,sum=0;
		n=x.nextInt();
		int marks[]=new int[10];
		System.out.println("enter the array elements:");
		for(i=0;i<n;i++) {
			marks[i]=x.nextInt();
			sum=sum+marks[i];
		}
		System.out.println("the array elements are:");
		for(i=0;i<n;i++) {
			System.out.print(+marks[i]+" ");
		}
		System.out.print("\nthe sum of array ele is:"+sum);

	}

}
