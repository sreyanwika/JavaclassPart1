package javaClass;
import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		// diamond pattern
		Scanner x=new Scanner(System.in);
		int i,j,r;
		//upper half pyramid
		   System.out.print("Input number of rows: ");
		   Scanner in = new Scanner(System.in);
				    r = in.nextInt();
		   for(i=0;i<=r;i++)
		   {
		     for(j=0;j<=r-i;j++)
		     System.out.print(" ");
		     for(j=1;j<=2*i-1;j++)
		       System.out.print("*");
		     System.out.print("\n");
		   }
		   //down half pyramiddd
		   for(i=r-1;i>0;i--) {
			   for(j=0;j<=r-i;j++)
				     System.out.print(" ");
				     for(j=1;j<=2*i-1;j++)
				       System.out.print("*");
				     System.out.print("\n");
			   
		   }
		   if(args.length>0) {
			   try {
			     int a,b;
			     a=Integer.parseInt(args[0]);
			     b=Integer.parseInt(args[1]);
			     int sum=a+b;
			     System.out.println(sum);
		   }catch(NumberFormatException e) { 
			   System.err.println("Argument must be an integer.");
		   }
				
		   }
		}

	}


