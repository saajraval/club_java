package club_java.Basics;
import java.util.Scanner;
public class SwitchLogics {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SwitchLogics sw = new SwitchLogics();
		while(true) {
			System.out.println("Enter a number  : ");
			int num = sc.nextInt();
			System.out.println("\n 1-> Prime \n2-> Armstrong \n3-> Palindrome \n 0-> Exit\n Enter your choice :");
			int choice = sc.nextInt();
			switch(choice) {
				case 1 : boolean ans = sw.prime(num);
						if(ans) {
							System.out.println(" Prime !!");
						}
						else {
							System.out.println(" Not Prime !!");
						}
						break;
				case 2: boolean ans1 = sw.armstrong(num);
						if(ans1) {
							System.out.println(" Armstrong Number !!");
						}
						else {
							System.out.println("Not Armstrong Number !!");
						}
						break;
				case (9/3): sw.palindrome(num);
						break;
				case 2-2 : System.exit(0);
			}//end of switch
		}//end of while
	}//end of main
	
	boolean prime(int num) {
		boolean flag = true;
		for(int i = 2 ;i<num;i++) {
			if(num%i ==0) {
				flag = false ;
				break;
			}
		}//end of for
		return flag ;
	}
	// 13 -> 2 ......12 

	// 1234 -> 1*1*1*1 + 2*2*2*2 + 3*3*3*3 + 4*4*4*4 = 1 + 16 + 81 + 256 = ....
	// 153 -> 1 + 125 +27 = 153 
	
	boolean armstrong(int num) { // 153
		int r,sum =0,temp =num; // 15
		while(temp!=0) { // 1
			r= temp%10; // 1  
			sum += (r*r*r);// 153 
			temp/=10;//0
		}
		if(sum == num) { // 153 == 153 
			return true;
		}
		else {
			return false;
		}
	}//end of armstrong 
	
	//123 321 
	//121 121
	
	void palindrome(int num) {
		int r,rev=0, temp = num;
		while(temp !=0) {//1 
			r= temp %10;// 1
			rev = rev *10 + r;// 321
			temp/=10;//0
		}//end of while
		if(num == rev ) {
			System.out.println(" Palindrome !!");
		}
		else {
			System.out.println("Not Palindrome !!");
		}
	}
}//end of class

