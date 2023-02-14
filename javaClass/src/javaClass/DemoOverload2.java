package javaClass;
//19 date
public class DemoOverload2 {
	  void add(int a,int b) {
		   //a=a;
		    //b=b;
		  int sum=a+b;
		  System.out.println("the sum of two variables is: "+sum);
	  }
	  void add(int a,int b,int c) {
		   //a=a;
		   //b=b;
		   //c=c;
		  int sum=a+b+c;
		  System.out.println("the sum of three variables is: "+sum);
	  }
	  void add(double a,double b,double c) {
		  //a=a;
		   //b=b;
		   //c=c;
		  double sum=a+b+c;
		  System.out.println("the sum of three variables is: "+sum);
	  }
	  void add(float a,float b,float c) {
		  //a=a;
		   //b=b;
		   //c=c;
		  float sum=a+b+c;
		  System.out.println("the sum of three variables is: "+sum);
	  }
	public static void main(String[] args) {
		//changing data type
		DemoOverload2 l=new DemoOverload2();
		l.add(111, 12);
		l.add(111.56788,12.555,15.67777);
		l.add(111.56788f,12.555f,15.67777f);
		
	}

}
