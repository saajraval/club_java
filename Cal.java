package club_java;
//import java.lang.*;
import java.util.Scanner;

// 1 lakh+ 
public class Cal {
//	%d %f 

		public static void main(String[] args) {
//			int a=101,b=20,c;
//			c=a+b;
//			System.out.println("SUM : "+(a+b));
//					printf("%d",a+b));
//			System.out.println(d);
			
			Scanner scr = new Scanner(System.in);
			int num1,num2,ans;
			
//			float fl;
//			fl=scr.nextFloat()
		
			while(true) {
				System.out.println("Enter two numbers :");
				num1 = scr.nextInt();
				num2 = scr.nextInt();
				System.out.println("1 -> Additon\n2 -> Subtraction \n3 random value \n0 -> Exit\nEnter your choice");
				int choice=scr.nextInt();
				
				switch(choice) {
					case 1 : System.out.println(" SUM : "+(num1+num2));
						break;
					case 2: System.out.println(" DIFFERENCE : "+(num1-num2));
						break;
					case 3: double x =Math.random();
							System.out.println(" Your random number is : "+ (int)(x*1000000000));
							break;
					case 0:System.exit(0);
					default: System.out.println("Invalid choice!!");
				}
			}//end of while
			
		}
}
