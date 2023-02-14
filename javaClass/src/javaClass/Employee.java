package javaClass;

import java.util.Scanner;

class Employe {
	private 
	 int id;
	String name;
	float salary;
	Scanner x=new Scanner(System.in);
	public 
	 void setData() {
		System.out.println("enter the id,nmae and salary");
		id=x.nextInt();
		name=x.next();
		salary=x.nextFloat();
	}
	void displayData() {
		System.out.println("\nthe id of the employee is:"+id+"\nd name is:"+name+"\nthe salary is:"+salary);
	}
}
public class Employee{
    public static void main(String[] args) {
		// TODO Auto-generated method stub
    	Employe a=new Employe();
    	a.setData();
    	a.displayData();
	}

}
