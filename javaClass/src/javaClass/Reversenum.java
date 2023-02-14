package javaClass;
import java.util.Scanner;
public class Reversenum {

	public static void main(String[] args) {
		// reversing the given number....([prob4)
		int d,rev=0,n;
		Scanner x=new Scanner(System.in);
		System.out.println("enter d value of n:");
		n=x.nextInt();
		while(n!=0) {
			d=n%10;
			rev=rev*10+d;
			n=n/10;
		}
		System.out.println(rev);

	}

}
