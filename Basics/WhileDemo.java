package club_java.Basics;
import java.util.Scanner;
public class WhileDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter a number :");
		int num= sc.nextInt();
		int count= 0;
		while(num!=0) {
			num/=10;// num = num /10
			count++;
		}//end of while
		System.out.println(" Number of digits : "+count);
	}//end of main
}//end of class
//
//if no. of digits are even then print all the odd numbers else print even numbers also do their sum 
//EG: 
//		1) 1234 -> 4
//			1 3 -> sum = 4
//	
//		2)12345 -> 5
//			2 4 sum = 6
//-------------------------------------------------------------------------
// take a number from user and make two numbers from it 
// num =  12345678989 
// even_num=  24688
// odd_num=  135799
//-------------------------------------------------------------------------
// Make a switch  having cases  1 -> prime in range 2-> armstrong in rage  3-> palindrome in range 

// 153 = 1*1*1 + 5*5*5 + 3*3*3 -> 1 + 125 + 27 =153 
 

//----------------------------------------------

// 0 1 1 2 3 5 8 13 21 
