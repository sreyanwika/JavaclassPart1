package javaClass;
import java.util.Scanner;
public class TDrray {

	public static void main(String[] args) {
		// printing 2 dimension array of matrix...
		
		Scanner x=new Scanner(System.in);
		System.out.println("enter the value of n:");
		int n,i,j;
		n=x.nextInt();
		int s[][]=new int[3][3];
		System.out.println("enter the matrix array elements:");
		for(i=0;i<n;i++) {
			for(j=0;j<n;j++) {
				s[i][j]=x.nextInt();
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
		

	}

}
