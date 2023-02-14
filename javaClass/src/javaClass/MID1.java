package javaClass;
import java.util.Scanner;
public class MID1 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in); 
		int i,a=0,b=1,c=0,t;
		System.out.println("Enter value of t:"); 
		t=input.nextInt();
		for(i=0;i<t;i++) {
			System.out.println(t+"th value of the series is:"+a);
			c=a+b;
			a=b;
			b=c;
		}
		int x=5;
		int y=9;
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println(x+" "+y);

			}
		}


	
