package javaClass;
import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner x=new Scanner(System.in);
		System.out.println("enter the  value of code:");
		int code=x.nextInt();
		switch (code) {
		case 1:
			System.out.println("the color is red");
			break;
		case 2:
			System.out.println("the color is yellow");
			break;
		case 3:
			System.out.println("the color is green");
			break;
		case 4:
			System.out.println("the color is white");
			break;
		case 5: 
			System.out.println("the color is black");
			break;
		default:
			System.out.println("option is not valid");
			
		}
		//simple calacy(prob7)
		 System.out.println("enter the value of a:");
		 int a=x.nextInt();
		 System.out.println("enter the value of b:");
		 float b=x.nextInt();
		 //float b=x.nextFloat();
		 System.out.println("enter the operator(+,-,*,/,%):");
		 char operator=x.next().charAt(0);
		 switch (operator) {
			case '+':
				System.out.println("the sum of 2 num is:"+(a+b));
				break;
			case '-':
				System.out.println("the sub of 2 num is:"+(a-b));
				break;
			case '*':
				System.out.println("the mul of 2 num is:"+(a*b));
				break;
			case '/':
				System.out.println("the div of 2 num is:"+(a/b));
				break;
			case '%': 
				System.out.println("the mod of 2 num is:"+(a%b));
				break;
			default:
				System.out.println("option is not valid");                                                                                                                                               
				
			}
		 //another way
		 System.out.println("enter the value of a:");
		 int d=x.nextInt();
		 System.out.println("enter the value of b:");
		 float e=x.nextInt();
		 //float b=x.nextFloat();
		 System.out.println("enter the operator(a-add,s-sub,m-mul,d-div,r-mod):");
		 char op=x.next().charAt(0);
		 switch (op) {
			case 'a':
				System.out.println("the sum of 2 num is:"+(a+b));
				break;
			case 's':
				System.out.println("the sub of 2 num is:"+(a-b));
				break;
			case 'm':
				System.out.println("the mul of 2 num is:"+(a*b));
				break;
			case 'd':
				System.out.println("the div of 2 num is:"+(a/b));
				break;
			case 'r': 
				System.out.println("the mod of 2 num is:"+(a%b));
			default:
				System.out.println("option is not valid");
				
			}

	}

}
