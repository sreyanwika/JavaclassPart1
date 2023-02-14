package javaClass;
import java.util.Scanner;
public class Mtable {

	public static void main(String[] args) {
		// the multiplication of n number..(prob 6)
		int n,res = 1,i;
		Scanner x=new Scanner(System.in);
		System.out.println("enter d value of n:");
		n=x.nextInt();
		for(i=1;i<=10;i++) {
			res=n*i;
			System.out.println(n+"*"+i+"="+res);
			System.out.println(n+"x"+i+"="+res);
		}

	}

}
