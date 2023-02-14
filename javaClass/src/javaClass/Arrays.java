package javaClass;
import java.util.Scanner;
//creating an array with n elements..
public class Arrays {
	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		System.out.println("enter the value of n:");
		int n,i;
		n=x.nextInt();
		int marks[]=new int[10];
		System.out.println("enter the array elements:");
		for(i=0;i<n;i++) {
			marks[i]=x.nextInt();
		}
		System.out.println("the array elements are:");
		for(i=0;i<n;i++) {
			System.out.print(+marks[i]+" ");
		}
	}


}
