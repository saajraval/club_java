package club_java.ArrayDemo;
import java.util.Scanner;
public class Two_DArrayDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the rows :");
		int rows =sc.nextInt();
		System.out.println("Enter the columns :");
		int cols =sc.nextInt();
		int a[][]  = new int [rows][cols];
		
		System.out.println("Enter the elements ");
		for( int i=0 ; i<rows;i++) {
			for(int j=0;j<cols;j++) {
				System.out.println("a["+i+"]["+j+"] : ");
				a[i][j] = sc.nextInt();
			}
		}
		
	}//end of main
}//end of class
