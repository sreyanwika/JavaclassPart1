package javaClass;
import java.util.Scanner;
public class Fibonacci {

	public static void main(String[] args) {
		// fibonacci series...(prob9)
		System.out.println("enter d value of e:");
		Scanner x=new Scanner(System.in);
		int e=x.nextInt();
		int a=0,b=1,Nxtnum = 0,i;
		for(i=0;i<=e;i++) {
			System.out.println("the fibanacci series:"+a);
			Nxtnum=a+b;
			a=b;
			b=Nxtnum;
			
		}
		
	}

}
