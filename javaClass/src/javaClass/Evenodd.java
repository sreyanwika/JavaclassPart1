package javaClass;
import java.util.Scanner;

public class Evenodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner x=new Scanner(System.in);
		int a=x.nextInt();
		if(a%2==0) {
			System.out.println("even");
		}
		else {
			System.out.println("odd");
		}
		String  out=(a%2==0)?"even":"odd";
		System.out.println(out);
		
	}

}
