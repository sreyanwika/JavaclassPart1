package javaClass;
import java.util.Scanner;
public class Even {

	public static void main(String[] args) {
		// printing 1 to n even numbers....(12 prob).
		Scanner x=new Scanner(System.in);
		System.out.println("enter d value of n:");
        int a=x.nextInt();
        for(int i=1;i<=a;i++) {
        	if(i%2==0) {
        		System.out.println("the even num is:"+i);
        	}

	}
	}
}
