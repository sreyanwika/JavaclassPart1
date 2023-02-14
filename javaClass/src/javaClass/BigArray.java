package javaClass;

import java.util.Scanner;
//finding the biggest element from the array

public class BigArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner x=new Scanner(System.in);
		System.out.println("enter the value of n:");
		int n,i,l,max =0,temp;
		n=x.nextInt();
		int marks[]=new int[10];
		System.out.println("enter the array elements:");
		for(i=0;i<n;i++) {
			marks[i]=x.nextInt();
		}
			max=marks[0];
			for(l=1;l<n;l++) {
				if(max<marks[l]) {
					temp=max;
					max=marks[l];
				}
				
		}
		System.out.println(max);
	}

}
