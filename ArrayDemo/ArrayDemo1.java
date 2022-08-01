package club_java.ArrayDemo;
import java.util.Scanner;
public class ArrayDemo1 {

		public static void main(String[] args) {
			Scanner sc  =new Scanner(System.in);
			// int a[10]
			System.out.println("Enter the size of the array : ");
			int size = sc.nextInt();
			int [] a = new int[size];
			//int len = a.length;//
			System.out.println(" length of the array : "+a.length);
			for(int i= 0;i<size;i++) {
				System.out.println("a["+i+"] :"); // a[1]
				a[i] = sc.nextInt();
			}//end of for
			// 1 2 3 4 -> 5
			for(int i =0;i<size;i++) {
				System.out.print(" "+a[i]);
			}
		}//end 
}//end of class

// scan  display reverse sort 

// 12 3 4 7 8 4 -> 6 
//even -> 12 4 8 4 -> 4
//odd -> 3 7 -> 2


