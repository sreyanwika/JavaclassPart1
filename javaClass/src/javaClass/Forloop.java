package javaClass;
import java.util.Scanner;

public class Forloop {

	public static void main(String[] args) {
		// program to print 1 to n numbers(13 probb)
		Scanner x=new Scanner(System.in);
		System.out.println("enter the value of n:");
		int n=x.nextInt();
		for(int i=1;i<=n;i++) {
			System.out.println(i);
		}

	}

}
