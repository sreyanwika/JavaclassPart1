package javaClass;
class stdnt{
	private String rollnum;
	private String name;
	private int age;
	public void set_data() {
		rollnum="20211BCA0044";
		name="sreyanwka";
		age=18;
		
	}
   public void displayData() {
	   System.out.println("the rollnum of student from 3bca1 is:"+rollnum+"the name of the student:"+name+"n the age is:"+age);
   }
}
public class Demo1 {

	public static void main(String[] args) {
		stdnt a=new stdnt();
		a.set_data();
		a.displayData();

	}

}
