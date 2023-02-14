package javaClass;


abstract class anol{
protected
int a;
public 
abstract void setdata();
void display() {
	System.out.println("the value of a is:"+a);
}

}
class B extends anol{
public 
 void setdata() {
	a=10;
}
}

public class abstct {

	public static void main(String[] args) {
		B a1=new B();
		a1.setdata();
		a1.display();

	}

}
