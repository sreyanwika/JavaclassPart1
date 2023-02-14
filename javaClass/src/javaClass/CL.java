package javaClass;

public class CL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float sum,sub,mul;
		float div;
		int x=Integer.parseInt(args[0]);
		float x1=Float.parseFloat(args[1]);
		sum=x+x1;
		sub=x-x1;
		div=x/x1;
		mul=x*x1;
		System.out.println(sum);
		System.out.println(sub);
		System.out.println(div);
		System.out.println(mul);
	}

}
