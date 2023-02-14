package javaClass;
import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		// checking whether the given number is palindrome or not(prob5)...
		
		int d,rev=0,n;
		Scanner x=new Scanner(System.in);
		System.out.println("enter d value of n:");
		n=x.nextInt();
		int b=n;
		while(n!=0) {
			d=n%10;
			rev=rev*10+d;
			n=n/10;
		}
		System.out.println(rev);
		if(b==rev) {
			System.out.println("the number is palindrome");
		}
		else {
			System.out.println("the number is not palindrome");
		}
	}

}
