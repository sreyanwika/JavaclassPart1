package javaClass;
import java.util.Scanner;

public class Whileloop {

	public static void main(String[] args) {
		int a=1;
		while(a<=10) {
			System.out.println("nothinggg");
			a++;
		}
		Scanner x=new Scanner(System.in);
		System.out.println("enter alphablets(only small not caps):");
		char b=x.next().charAt(0);
		if (b=='a') {
			System.out.println("your guess is right");
			
		}
		int c=1;
		while(c<=5) {
			System.out.println("nothinggg");
			c++;
		}
		int d=6;
		while(d<=6) {
			System.out.println("nothinggg");
			d++;
		}
		//do while
		int e=1;
		do {
			System.out.println("nothinggg");
			e++;
		}while(e<=6);

	}

}
