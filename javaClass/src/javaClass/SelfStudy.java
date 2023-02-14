package javaClass;
import java.util.Scanner;
public class SelfStudy {

	public static void main(String[] args) {
		// self study prob 1...
		Scanner x=new Scanner(System.in);
		System.out.println("enter the number: ");
		int a=x.nextInt();
		if((a%2==0)&&(a%5==0)){
	          System.out.println("the num "+a+"is div by both 2 n 5");		
		}
		else if((a%2==0)&&(a%5!=0)){
			System.out.println("the num "+a+"is div by only 2 ");
			
		}
		else if((a%5==0)&&(a%2!=0)) {
			System.out.println("the num "+a+"is div by only 5 "+a);
			
		}
		else {
			System.out.println("it is not div by bth numberss ");
		}
		//2nd probbb
		float bs,hra,da,pt,gs,ns,it;
		System.out.println("enter the basic salary: ");
		bs=x.nextFloat();
		System.out.println("enter the hra: ");
		hra=x.nextFloat();
		System.out.println("enter the da: ");
		da=x.nextFloat();
		gs=bs+hra+da;
		System.out.println("enter the pt: ");
		pt=x.nextFloat();
		if(gs>50000) {
			it=(10/100)*gs;
		}
		else {
			it=(2/100)*gs;
		}
		float x1=(gs-pt);
		ns=x1-it;
		System.out.println("the net salary drawn by the employee"+ns);
		//3rd probbb
		System.out.println("enter the age: ");
		int y=x.nextInt();
		System.out.println("madan age is:"+y);
		if(y>=18) {
			System.out.println("madan is eligible for casting vote");
		}
		else {
			System.out.println("not eligiblee");
		}
		
	}

}
