package javaClass;
import java.util.Scanner;
class emp1{
	//class for employee data using default constructor through user input...
	private 
	 int id;
	 String name;
	 float salary;
	public 
	 emp1() {
		System.out.println("enter the values:");
		Scanner x=new Scanner(System.in);
		id=x.nextInt();
		name=x.next();
		salary=x.nextFloat();
	}
	void displayData1() {
		System.out.println("\nthe id of the employee is:"+id+"\nd name is:"+name+"\nthe salary is:"+salary);
	}
		
	}
public class Cdefault1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		emp1 a1=new emp1();
		a1.displayData1();
		emp1 a2=new emp1();
		a2.displayData1();
	}

}
