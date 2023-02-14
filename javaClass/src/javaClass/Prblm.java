package javaClass;
import java.util.Scanner;

public class Prblm {

	public static void main(String[] args) {
		// checking whether the both lengths are equal or not
		System.out.println("enter the two numbers:");
		Scanner x=new Scanner(System.in);
		int a=x.nextInt();
		int b=x.nextInt();
		if(a==b) {
			System.out.println("they are equallll");
		}
		else {
			System.out.println("the numbers are not equalll");
		}

	}

}
