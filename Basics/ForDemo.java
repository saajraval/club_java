package club_java.Basics;
import java.util.Scanner;
public class ForDemo {
//	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter two numbers  :");
//		ForDemo f = new ForDemo();
//		int num1 = f.sc.nextInt();
//		int num2 = f.sc.nextInt();
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int sum =0;
		for(int i =num1 ;i<=num2;i++) {
			if(i%2 == 0) {
				sum +=i;
			}
		}//end of for
		System.out.println(" SUm of even numbers are : "+sum);
	}
}

/*
 	*
 	**
 	***
 	****
*/