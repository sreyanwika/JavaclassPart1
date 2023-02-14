package javaClass;
import java.util.Scanner;
public class Biggest {

	public static void main(String[] args) {
		// finding the biggest 1st 2nd 3rd...10prob
     Scanner x=new Scanner(System.in);
     int a=x.nextInt();
     int b=x.nextInt();
     int c=x.nextInt();
     if((a>b && a>c) && (a>b && b>c) && (a>c && b>c)) {
    	 System.out.println("a is 1st biggg numb,b is 2nd biggg numb,c is 3rd biggg numb");
     }
     else if((b>a && b>c) & (b>a && a<c) & (b<c && a>c)) {
    	 System.out.println("b is 1st biggg numb,c is 2nd bigg, b is 3rdd biggg"); 
     }
     else if((c>a && c>b) & (c>a && b<a) & (c>b && b<a) ){
    	 System.out.println("c is 1st biggg numb,a is 2ndd,b iss 3rdd");
     }
	}
}
                                                              