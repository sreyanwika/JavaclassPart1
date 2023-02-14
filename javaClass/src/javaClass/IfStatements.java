package javaClass;
import java.util.Scanner;

public class IfStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//if statement
		int a=11;
		if (a<11) {
			System.out.println("upper primary");
		}
		int b=9;
		if (b<11) {
			System.out.println("upper primary");
		}
		int c=10;
		if (c<11) {
			System.out.println("upper primary");
		}
		System.out.println("greater than 11");
       // if else
		//checking age
		int d=18;
		if(d==18) {
				System.out.println("u are 18 yrs old");
			}
		else {
			System.out.println("u are not 18 yrs old");
			
		}
		//finding even or odd
		if (d%2==0) {
			System.out.println("even num");
		}
		else {
			System.out.println("else not a even num/odd num");
			
		}
		//else if
		//grade finding
		Scanner x=new Scanner(System.in);
		int e=x.nextInt();
		int i;
		boolean say = false ;
		if (e==50 && e>=45) {
			System.out.println("excellent score");
			
		}
		else if(e<=44 && e>=35) {
			System.out.println("good score");
			
		}
		else if(e>=25 && e<=34) {
			System.out.println("average score");
			
		}
		else if(e<=24 && e>=15) {
			System.out.println("bad score");
		}
		else {
			System.out.println("false");
		}
		//positive or negative or zero....
		if(e>0) {
			System.out.println("positive number");
		}
		else if(e<0) {
			System.out.println("negative number");
		}
		else {
			System.out.println("zero");
		}
		//finding whether the given number is prime or not(prob3)...
		for(i=2;i<e;i++) {
		if(e%i!=0) {
			System.out.println("prime");
			break;
		}
		else {
			System.out.println("not prime");
		}
		}
		for(i=2;i<e;i++) {
			if(e%i!=0) {
				say=true;
			}
			if (say==true){
				System.out.println("prime");
				break;
				
					}
			else {
				System.out.println("not prime");
			}
			}
		//ternary operator
		int j=11;
		String answer=(j%2==0)?"even":"oddd";
		System.out.println(answer);
		//finding large among three numbers(prob10)
		int y=x.nextInt();
		int z=x.nextInt();
		int m=x.nextInt();
		if(y>z && y>m){
		System.out.println("y is big");
		}
		else if(z>y && z>m){
		System.out.println("z is big");
		}
		else if(m>y && m>z){
		System.out.println("m is big");
		}
		else{
		System.out.println("not valid");
		}
		//rational operators
		int y1=x.nextInt();
		int z1=x.nextInt();
		int m1=x.nextInt();
		if(y1>=z1 && y1>=m1){
		System.out.println("y is big");
		}
        else if(z1>=y1 && z1>=m1){
		System.out.println("z is big");
		}
		else if(m1>=y1 && m1>=z1){
		System.out.println("m is big");
		}
		}
		}
	


