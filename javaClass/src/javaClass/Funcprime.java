package javaClass;
import java.util.Scanner;
public class Funcprime {
	//problem for finding whether the given number is prime or not by passing parameters and without return value(prob8)
  //main 
	public static void main(String[] args) {
		int l;
		boolean answ = false;
		Scanner x=new Scanner(System.in);
		System.out.println("enter d value of n:");
		l=x.nextInt();
		Prime(l);}
	//func
		public static void Prime(int n){
			boolean answ=false;
			for(int a=2;a<n;a++) {
				if(n%a!=0) {
					answ=true;
				}
			}
			if(answ==true) {
				System.out.println("num z prime:"+n);
				
			}
			else {
				System.out.println("num z not prime:"+n);
			}
			
		}
	}


