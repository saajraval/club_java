package club_java.stringsDemo;
import java.util.Scanner;
public class SearchWord {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// aarav is sleeping
		System.out.println("Enter the string :");
		String str = sc.nextLine();
		System.out.println("Enter the word to search :");
		String word = sc.next();
		
		String data[] = str.split(" ");
		//arrav is sleeping
		int count =0;
		System.out.println(" Word found at :\n");
		for(int i = 0;i<data.length;i++) {
			if(data[i].equals(word)) {
				System.out.print((i+1)+" , ");
				count++;
			}
			else if((i==data.length-1 )&& (count ==0)){
				System.out.println(word+" not found in : "+str);
			}
		}
		System.out.println("Word found "+count+" times.");
//		split("i")
	}//end of main
}//end of class


//
//-----------------------------------
//
//aarav is learing java , java is a easy language 
//aarav -> 1
//java -> 4 6
//
//java found 2 time 
//
//CPP
//
//CPP not found in the string : 
//
//
//
//--------------------------------------------------
//
//take a mail id from user and take a password  
//validate both the things in it 
//saajravals7r@gmail.com
//email : XXX@XXX.XXX 
//X -> [A-Z a-z 0-9]
//
//password : spcaes are not allowed and it should be of atleast 8 character long 
//
//----------------------------------------------------------------
//case 1: sign up 
//case 2: sign in -> mail id password  -> "You are successfully logged in !!" 
//	if mail id is correct but the password is wrong then keep asking the password until its entered correct 
//	
//	
//	String methods , UNICODE values , loops(do while) , switch case 
