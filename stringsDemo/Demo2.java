package club_java.stringsDemo;
import java.util.Scanner;
public class Demo2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string to reverse : ");
		String  str1 = sc.nextLine();
		String rev="";
		for(int i = str1.length()-1 ; i>=0 ; i--) {
			rev += str1.charAt(i);
		}
		System.out.println("Reverse of the given string is : "+rev);
		if(str1.equalsIgnoreCase(rev)) {
			System.out.println("The string is palindrome : "+str1);
		}
		else {
			System.out.println("The string is not palindrome : "+str1);
		}
//		System.out.println("a+ b :"a+b);
	}//end of main
}//end of class
