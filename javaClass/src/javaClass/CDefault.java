package javaClass;
class Emp{
	//class for employee data using default constructor....
	private 
	 int id;
	 String name;
	 float salary;
	public 
	 Emp() {
		id=123;
		name="poorvitha";
		salary=3000000f;
	}
	void displayData1() {
		System.out.println("\nthe id of the employee is:"+id+"\nd name is:"+name+"\nthe salary is:"+salary);
	}
		
	}
public class CDefault {

	public static void main(String[] args) {
	   Emp a=new  Emp();
	   a.displayData1();

	}

}
