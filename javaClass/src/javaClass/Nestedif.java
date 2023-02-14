package javaClass;
import java.util.Scanner;

public class Nestedif {

	public static void main(String[] args) {
		//finding large number among three numbers using nestedif
		Scanner x=new Scanner(System.in);
		System.out.println("enter the value of a:");
		int a=x.nextInt();
		System.out.println("enter the  value of b:");
		int b=x.nextInt();
		System.out.println("enter the  value of c:");
		int c=x.nextInt();
		if(a>b) {
			if(a>c) {
				System.out.println("a is biggg");
			}
			else {
				System.out.println("c is biggg");
			}
		}
		else if(b>c) {
			System.out.println("b is biggg");
		}
		else {
			System.out.println("c is biggg");
		}
		//problem to display the favorite  color by using if else
		System.out.println("enter the  value of code:");
		int code=x.nextInt();
		if(code==1) {
			System.out.println("the color is red");
		}
		else if(code==2) {
			System.out.println("the color is yellow");
		}
		else if(code==3) {
			System.out.println("the color is green");
		}
		else if(code==4) {
			System.out.println("the color is white");
		}
		else if(code==5) {
			System.out.println("the color is black");
		}
		else {
				System.out.println("not valid");
			}
		}
		}
		



