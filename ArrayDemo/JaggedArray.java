package club_java.ArrayDemo;

import java.util.Scanner;

public class JaggedArray {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of Rows :");
		int rows = sc.nextInt();
		int a[][] = new int [rows][];
		
		for(int i = 0 ;i<rows;i++) {
			System.out.println("Enter the number of columns for"+(i+1)+" row:  ");
 			int x = sc.nextInt();
 			a[i] = new int[x];
		}
		System.out.println("The array is : \n");
		for(int i =0 ;i<a.length;i++) {
			for(int j =0;j<a[i].length;j++) {
				System.out.println("Enter the element for a["+i+"]["+j+"]:" );
				a[i][j] = sc.nextInt();
			}
		}
		for(int i =0 ;i<a.length;i++) {
			for(int j =0;j<a[i].length;j++) {
				System.out.print(" "+a[i][j]);
			}
			System.out.println("\n");
		}
	}//end of main
}//end of class
