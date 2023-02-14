package javaClass;
import java.util.Scanner;
public class TDarysum {

		public static void main(String[] args) {
			// printing 2 dimension array of matrix sum...
			
			Scanner x=new Scanner(System.in);
			System.out.println("enter the value of n:");
			int n,i,j,sum=0;
			n=x.nextInt();
			int s[][]=new int[3][3];
			System.out.println("enter the matrix array elements:");
			for(i=0;i<n;i++) {
				for(j=0;j<n;j++) {
					s[i][j]=x.nextInt();
					sum=sum+s[i][j];
				}
			}
			System.out.println("the matrix array elements are:");
			for(i=0;i<n;i++) {
				for(j=0;j<n;j++) {
					System.out.print(s[i][j]+" ");
					System.out.print(" ");
				}
				System.out.print("\n");
				}
			System.out.println("the sum of matrix is:"+sum);
			

		}

}
