package javaClass;
class Area1 {
	private
	  float a,b;
	public
	 void area(float a1) {
		b=a1;
		float ar=b*b;
		System.out.println("the area of square is:"+ar);
		
	}
	void area(float b1,float a2) {
		a=b1;
		b=a2;
		float ar=a*b;
		System.out.println("the area of rectangle is:"+ar);
	}
	void area1(float a3) {
		a=a3;
		double ar=(3.14)*a*a;
		System.out.println("the area of circle is:"+ar);
		
		
	}

}
public class Area{
	public static void main(String[] args) {
		Area1 z=new Area1();
		z.area(11);
		Area1 z1=new Area1();
		z1.area(11,12);
		Area1 z2=new Area1();
		z2.area1(13);
		
		
	}
	
}
