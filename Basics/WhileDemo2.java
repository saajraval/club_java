package club_java.Basics;
import java.util.Scanner;
public class WhileDemo2 {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int num = sc.nextInt();//123
		int count =0, temp = num ;
		while(temp != 0 ) {//
			temp/= 10;// 
			count++;// 
		}// end of while 
//		System.out.println(" Digits : "+count);
		// 12345678 
		int rev_num=0;
		while(num!=0) {
			rev_num =rev_num *10 + (num%10);
			num/=10;
		}//87654321
//		System.out.println("reverse number : "+rev_num);
		if(count %2 == 0) {
			// odd number 
			int odd_num =0,r;
			while(rev_num!=0) {
				r= rev_num % 10;
				if(r%2 !=0 ) { 
					odd_num =odd_num * 10 + r;
				}//end of inner if
				rev_num/=10;//123
			}//end of while
			System.out.println(" The odd number is : "+odd_num);
		}// end of if
		else {
			// even number 
			int even_num = 0,r;

			while(rev_num!=0) {
				r= rev_num % 10;
			if(r%2 == 0 ) { 
				even_num =even_num * 10 + r;
			}//end of inner if
			rev_num/=10;//123
		}//end of while
		System.out.println(" The even number is : "+even_num);
		}
	}//end of main
}//end of class

//-----------------------------------------
//
//123456789 -> 9
//2468
//
//22221  -> 5
//2222
//
//12345678 -> 8 
//1357
//
//2222 -> 4
//0 
//111 -> 3
//0