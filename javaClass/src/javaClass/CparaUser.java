package javaClass;
import java.util.Scanner;
class Empoo{
	//parameter constructor....
	private
	int id;
	 String name;
	 float salary;
	public 
	 Empoo() {
		id=123;
		name="poorvitha";
		salary=3000000f;
	}
	Empoo(int i,String nme,Float sal){
		id=i;
		name=nme;
		salary=sal;
		
	}
	void displayData1() {
		System.out.println("\nthe id of the employee is:"+id+"\nd name is:"+name+"\nthe salary is:"+salary);
	}
}
public class CparaUser {

	public static void main(String[] args) {
		// using user input
		Scanner x=new Scanner(System.in);
		int a=x.nextInt();
		String n=x.next();
		float s=x.nextFloat();
		Empoo q=new Empoo(a,n,s);
		q.displayData1();
		Empoo q1=new Empoo(a,n,s);
		q1.displayData1();
		

	}

}
