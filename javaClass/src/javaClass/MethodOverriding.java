package javaClass;
import java.util.Scanner;
//method overriding using user input
class Sdnt{
	protected 
	String name;
	int rollnum;
	int sem;
	String branch;
	Scanner x=new Scanner(System.in);
	public
	void set_data() {
		name=x.next();
		rollnum=x.nextInt();
		sem=x.nextInt();
		branch=x.next();
		
	}
	void display_data(){
		System.out.println("the name of the student is:"+name+"the sem is:"+sem+"the rollnum of stu :"+rollnum+"the student is in:"+branch+"branch");
		
	}
}
class bca extends Sdnt{
	protected
	  int age;
	  String place;
	  public void set_data() {
		age=x.nextInt();
		place=x.next();
	  
}
	  void display_data(){
			System.out.println("the age of stdnt is:"+age+"student lives in;"+place);
			
	  }
}
public class MethodOverriding {

	public static void main(String[] args) {
		Sdnt a=new Sdnt();
		a.set_data();
		a.display_data();
		bca b=new bca();
		b.set_data();
		b.display_data(); 


	}

}
