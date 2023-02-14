package javaClass;
//19 date
public class demoOverload {
	private
	  int a,b,c;
	  void add(int a,int b) {
		    a=a;
		    b=b;
		  int sum=a+b;
		  System.out.println("the sum of two variables is: "+sum);
	  }
	  void add(int a,int b,int c) {
		   a=a;
		   b=b;
		   c=c;
		  int sum=a+b+c;
		  System.out.println("the sum of three variables is: "+sum);
	  }
	public static void main(String[] args) {
		demoOverload l=new demoOverload();
		l.add(11, 12);
		l.add(11,12,15);

	}

}
