package javaClass;
class Emplo{
	private
	  int id;
	  String name;
      Float salary;
    public
      void set_data(int ID,String nme,Float sal) {
    	id=ID;
    	name=nme;
    	salary=sal;
    }
    void display_data() {
    	System.out.println("\nthe id of the employee is:"+id+"\nd name is:"+name+"\nthe salary is:"+salary);
    }
	 
}
public class DDEmplo {

	public static void main(String[] args) {
		Emplo z=new Emplo();
		z.set_data(1234,"sreya",1111111f);
		z.display_data();
		
	}

}
