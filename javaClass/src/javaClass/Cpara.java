package javaClass;
import java.util.Scanner;
class Empo{
	//parameter constructor....
	private
	int id;
	 String name;
	 float salary;
	public 
	 Empo() {
		 Scanner x=new Scanner(System.in);
			id=x.nextInt();
			name=x.next();
			salary=x.nextFloat();
		}
	Empo(int i,String nme,Float sal){
		id=i;
		name=nme;
		salary=sal;
		
	}
	void displayData1() {
		System.out.println("\nthe id of the employee is:"+id+"\nd name is:"+name+"\nthe salary is:"+salary);
	}
}
public class Cpara {

	public static void main(String[] args) {
		Empo y=new Empo();
		y.displayData1();
		Empo y1=new Empo(111,"hareeyan",2000000f);
		y1.displayData1();
		

	}

}
