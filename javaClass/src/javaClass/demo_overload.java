package javaClass;
//19 datee
class demo {
private
  int a,b,c;
  void add(int z,int y) {
	  int a=z;
	  int b=y;
	  int sum=z+y;
	  System.out.println("the sum of two variables is: "+sum);
  }
  void add(int z,int y,int x) {
	  int a=z;
	  int b=y;
	  int c=x;
	  int sum=a+b+c;
	  System.out.println("the sum of three variables is: "+sum);
  }
}
 public class demo_overload {
	public static void main(String[] args) {
		
		demo l=new demo();
		l.add(11, 12);
		l.add(11,12,15);

	}

}
