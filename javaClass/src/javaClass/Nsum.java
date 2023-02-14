package javaClass;
import java.util.Scanner;
public class Nsum {

	public static void main(String[] args) {
		// finding the sum of n numbers from 1...(prob1)
		Scanner x=new Scanner(System.in);
		System.out.println("enter d value of n:");
		int n=x.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++) {
			sum=sum+i;
		}
		System.out.println("the sum of n numbers:"+sum);

	}

}
