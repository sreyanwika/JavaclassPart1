package javaClass;
import java.util.Scanner;
public class Factfunc1 {

	public static  void Facto(){
		System.out.println("enter d value of numb");
		   Scanner x=new Scanner(System.in);
		   int a=x.nextInt();
		   int fact=1;
		   for(int i=1;i<=a;i++) {
			   fact=fact*i;
		   }
		   System.out.println("the factorial value of anumb is:"+fact);
		   
	}
	public static void main(String[] args) {
		// using method find the factorial of a number
		
 Facto();
	}

}
