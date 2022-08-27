package club_java.stringsDemo;
import java.util.Scanner;

public class Demo1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 =new String("Royal");
		String str = "Royal";
		String str2 = new String("RoyaL");
//		string -> hashcode
		System.out.println("str1 -> "+str1.hashCode());
		System.out.println("str2 -> "+str2.hashCode());
		System.out.println("Str -> "+str.hashCode());
		
		System.out.println(str1.charAt(0));//R
		System.out.println(str1.toUpperCase());
		System.out.println(str1.toLowerCase());
		System.out.println(str1);
		System.out.println(str1.indexOf("y"));
		System.out.println(str1.startsWith("Ro"));
		System.out.println(str1.endsWith("L"));
		
		System.out.println(str1.contains("a"));
		System.out.println(str1.equals(str2));
		System.out.println(str1.compareTo(str2));
		System.out.println(str1.compareTo(str));
		
		System.out.println(str1.equalsIgnoreCase(str2));
		System.out.println(str1.compareToIgnoreCase(str2));

		System.out.println("Enter your name : ");
		String name = sc.nextLine();
		System.out.println(" Name is : "+name);
		// l - L  -> 32 
		//a - 97 
		//A - 65
	}//end of main
}//end of class



//s1 =""
//s2= "Raj"
//-> strcpy(s1,s2)
//print -> s1 = "Raj"
//
//-> s2= "patel"
//strcat(S1,S2) -> S1 -> = "Rajpatel"

// string is mutable -> C ,Cpp

//java -> String are immutable 




//----------------------------------------
//1 -> Find how many character are vowel and consonant in a given string 
//2 -> Take a string and reverse it also check whether the given string is palindrome or not
//3-> Find if a given word is present in a given string or not 
//4 -> "Jony jony yes papa" -> find how many times the word is being repeated  