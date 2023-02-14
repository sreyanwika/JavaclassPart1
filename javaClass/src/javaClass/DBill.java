package javaClass;
//19 date
class bill{
	private 
	 int q1,q2,q3;
	 float ppi;
	public 
	   bill(int a,int b,int c,float pppi) {
		q1=a;
		q2=b;
		q3=c;
		ppi=pppi;
	}
	void display() {
		float bill1=1;
		int q=q1+q2+q3;
		bill1=q*ppi;
		System.out.println("the total bill of three quantities: "+bill1);
	}
}
public class DBill {

	public static void main(String[] args) {
		bill amir=new bill(11,12,13,10.5f);
		amir.display();

	}

}
