package javaClass;

public class TypeCast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=6777;
		//assigning int to double (automatic type casting/widening) 
		double b=a;
		double c=44.888945;
		//int d=c; error occurs(incompatible type) 
		int d=(int)c;//manual conversion
		byte e=15;
		byte f=27;
		//byte g=(byte)e+f;
		//byte g=e+f;
		int g=e+f;
		//precedence rule
		int h=2+15*2/2-1;
		int i=3;
		int j=6;
		System.out.println(h);
		System.out.println(g);
		System.out.println(e);
		System.out.println(f);
		System.out.println(c);
		System.out.println(d);
		System.out.println(a);
		System.out.println(b);

	}

}
