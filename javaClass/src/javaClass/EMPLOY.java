package javaClass;
class Emplo1{
	private
	  int id;
	  String name;
      Float salary;
    public
      void set_data(int id,String name,Float salary) {
    	id=id;
    	name=name;
    	salary=salary;
    }
    void display_data() {
    	System.out.println("\nthe id of the employee is:"+id+"\nd name is:"+name+"\nthe salary is:"+salary);
    }
	 
}


public class EMPLOY {

	public static void main(String[] args) {
		// The member methods with parameter od same vaue of data members....?member method wid return value overload method
		Emplo1 z=new Emplo1();
		z.set_data(1234,"sreya",1111111f);
		z.display_data();

	}

}
