package javaClass;
import java.util.Scanner;
public class LABSHEET2 {
	//prob 1...
	Scanner x=new Scanner(System.in);
	private String id,name;
	private int age;
	private Float salary;
	static float ttlsalary;
	//q1a...
	void read() {
		System.out.println("enter the values of id,name,age,salary:");
		id=x.next();
		name=x.next();
		age=x.nextInt();
		salary=x.nextFloat();
		ttlsalary=+salary;
	}
	//q1b
	void read(String id) {
		id=this.id;
		name="sreya";
		age=18;
		salary=130000f;
		ttlsalary=+salary;
		
		
	}
	//q1c
	void read(String id,String name) {
		id=this.id;
		name=this.id;
		age=19;
		salary=120000f;
		ttlsalary=+salary;
		
		
	}

}
