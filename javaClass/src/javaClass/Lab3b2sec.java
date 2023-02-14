package javaClass;
import java.util.Scanner;
public class Lab3b2sec {

	public static void main(String[] args) {
		// 1>finding whether 2 len r equals r nottt
		System.out.println("enter the value of l1 and l2:");
		Scanner x=new Scanner(System.in);
		int l1=x.nextInt();
		int l2=x.nextInt();
		if(l1==l2) {
			System.out.println("Line Segments are equal");
		}
		else {
			System.out.println("Line Segments are not equal");
		}
		//2>finding whether the given numbers are pythagorean triplets r nottt
		int a,b,c;
		System.out.println("enter the value of a,b and c:");
		a=x.nextInt();
		b=x.nextInt();
		c=x.nextInt();
		if(a*a==b*b+c*c) {
			System.out.println("they are Pythagorean Triplets");
		}
		else if(b*b==a*a+c*c) {
			System.out.println("they are Pythagorean Triplets");
		}
		else if(c*c==a*a+b*b) {
			System.out.println("they are Pythagorean Triplets");
		}
		else {
			System.out.println("they are not Pythagorean Triplets");
		}
		//presidency guesture
		System.out.println("please enter your name:");
		String name=x.next();
		System.out.println("Hello "+name+", Welcome to Presidency University");
		//LAB EXERCISES
		//1st prob
		float a1,a2,a3;
		System.out.println("enter the threee assynmnt marks:");
		a1=x.nextInt();
		a2=x.nextInt();
		a3=x.nextInt();
		if((a1<=20) && (a2<=20) && (a3<=20)) {
			System.out.println("raju score in assynmnt in 1st course:"+a1);
			System.out.println("raju score in assynmnt in 2nd course:"+a2);
			System.out.println("raju score in assynmnt in 3rd course:"+a3);
			float ttl=a1+a2+a3;
			float avg=(a1+a2+a3)/3;
			System.out.println("raju total score in assynmnt in all course:"+ttl);
			System.out.println("raju total avg score in assynmnt in all course:"+avg);
		}
		else {
			System.out.println("error in marks assynmnt");
		}
		//2nd prob....
		//*lett 2nd yearr ppl b evn n 3rd yearrr odd
		System.out.println("enter the value of n:");
		int n=x.nextInt();//given n value 100
		int count=0;
		int count1=0;		
		for(int i=0;i<=n;i++) {
			if(i%2==0) {
				count=count+i;
			}
			else if(i%2!=0) {
				count1=count1+i;
			}
			
		}
		System.out.println("the sum of even numbers is:"+count);
		System.out.println("the sum of odd numbers is:"+count1);
		//3rd probbbb
		System.out.println("enter the operator(+,-,*,/,%):");
		char operator=x.next().charAt(0);
		System.out.println("enter the value of z:");
		 int z=x.nextInt();
		 System.out.println("enter the value of y:");
		 float y=x.nextInt();
		 //float b=x.nextFloat();
		 switch (operator) {
			case '+':
				System.out.println("the sum of 2 num is:"+(z+y));
				break;
			case '-':
				System.out.println("the sub of 2 num is:"+(z-y));
				break;
			case '*':
				System.out.println("the mul of 2 num is:"+(z*y));
				break;
			case '/':
				System.out.println("the div of 2 num is:"+(z/y));
				break;
			case '%': 
				System.out.println("the mod of 2 num is:"+(z%y));
				break;
			default:
				System.out.println("option is not valid");

	}
		 //4th probbb
		 int q,r;
		 System.out.println("enter the price of the item:");
		 r=x.nextInt();
		 System.out.println("the price of the item if quan is 1:"+r);
		 System.out.println("enter the quantity :");
		 q=x.nextInt();
		 int bill=1;
		 bill=q*r;
		 if((bill>=100)&&(bill<500)){
			 System.out.println("the total price of an item is:"+bill);
			 System.out.println("you won a gift A key ring");
			 
		 }
		 else if((bill>=500)&&(bill<1000)){
			 System.out.println("the total price of an item is:"+bill);
			 System.out.println("you won a gift  A leather purse");
		 }
		 else if(bill>1000){
			 System.out.println("the total price of an item is:"+bill);
			 System.out.println("you won a gift  A pocket calculator");
		 }
		 
		 System.out.println("thank you");
		 int r1;
		 float r2;
		 String r3;
		 System.out.println("enter the value of integer:");
		 r1=x.nextInt();
		 System.out.println("enter the value of float:");
		 r2=x.nextFloat();
		 System.out.println("enter the value of string:");
		 r3=x.next();
		 System.out.println(" the value of string:"+r3);
		 System.out.println(" the value of float:"+r2);
		 System.out.println(" the value of integer:"+r1);
		 int r4=3;
		 for(int k=r4;k>=1;k--) {
			 System.out.println(" the value of integer:"+r1);
			 
		 }
		 //remaining probs
		 //swapping numbers
		 System.out.println(" the value of a:");
		 int A=x.nextInt();
		 System.out.println(" the value of b:");
		 int B=x.nextInt();
		 System.out.println(" the value of a and b before swapping:"+A+","+B);
		 int temp;
		 temp=A;
		 A=B;
		 B=temp;
		 System.out.println(" the value of a and b after swapping:"+A+","+B);
		 //finding simple interest...
		 System.out.println(" the value of ppa:");
		 float ppa,t,roi,spi=1;
		 ppa=x.nextFloat();
		 System.out.println(" the value of t:");
		 t=x.nextFloat();;
		 System.out.println(" the value of roi:");
		 roi=x.nextFloat();
		 spi=ppa*t*roi;
		 System.out.println(" the value of simpleinterest is:"+spi);
		 //switch statement finding areas....
		 System.out.println("enter the operator(t-triangle,c-circle,r-rectangle):");
		 char op=x.next().charAt(0);
		 float len,brdth,rad,hyt,area1=1,area2=1,area3=1;
		 switch(op) {
		 case 't': System.out.println("enter the breadth:");
		           brdth=x.nextFloat();;
		           System.out.println("enter the height:");
		           hyt=x.nextFloat();;
			       area1=((brdth*hyt)/2);
			       System.out.println("the value of triangle is:"+area1);
		           break;
		 case 'c':
			       System.out.println("enter the radius:");
			       rad=x.nextFloat();area2=((22/7)*(rad*rad));
		           System.out.println("the value of circle is:"+area2);
		           break;
		 case 'r':System.out.println("enter the length:");
		          len=x.nextInt();
		          System.out.println("enter the breadth:");
		          brdth=x.nextFloat();;
			      area3=len*brdth;
		          System.out.println("the value of rectangle is:"+area3);
		          break;
         default:System.out.println("nott validd");	 
	}
		 float C,summ,X = 0,N;
		 System.out.println("enter the value of n:");
		 N=x.nextInt();
		 for(C=1;C<=N;C++) {
			 X=X+C;
		 }
		 summ=X/(N+1);
		 System.out.println("the sum is:"+summ);
		 float C1,summ1,X1 = 0,N1;
		 System.out.println("enter the value of n:"); 
		 N1=x.nextInt();
		 for(C1=1;C1<=N1;C1++) {
			 X1=X1+(C1/(C1+1));
		 }
		 summ1=X1;
		 System.out.println("the sum is:"+summ1);
		 
		 
		 
	}

}
