package club_java.ArrayDemo;
import java.util.Scanner;
public class ArrayDemo2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter the size of the array :");
		int size = sc.nextInt();
		int a[] = new int[size];
		System.out.println("Enter the elements of the array : ");
		for(int i=0;i<a.length;i++) {
			System.out.println("a["+i+"]: ");
			a[i] = sc.nextInt();
		}//end of for 
		
		System.out.println(" The original array is : ");
		for(int i=0;i<a.length;i++) {
			System.out.print(" "+a[i]);
		}
		//1 2 3 4
		//0 1 2 3
		//  2   4 
		
		int j=0,k=0,even[] = new int[size],odd[]=new int [size];
		for(int i=0;i<a.length;i++) {
			if(a[i]%2 == 0) {
				even[j]=a[i];
				j++;//2
			}
			else {
				odd[k]=a[i];
				k++;
			}
		}
		
		// javac filename.java
		//java Classname
		System.out.println("\nEven array is : \n");
		for(int i=0;i<even.length;i++) {
			System.out.print(" "+even[i]);
		}
		System.out.println("\nOdd array is : \n");
		for(int i=0;i<k;i++) {
			System.out.print(" "+odd[i]);
		}
 	}//end of main
}//end of class
