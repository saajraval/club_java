package club_java.Basics;

import java.util.Scanner;

public class ObjectArray {
	String name;
	int matchplayed , rank ;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of players you want ? :");
		int p = sc.nextInt();
		ObjectArray obj[] = new ObjectArray[p];
		
		//  Constructor needed to be called  to initialize value 
		
		for(int i=0;i<p;i++) {
			obj[i] =new ObjectArray();
			obj[i].getData();
			obj[i].calculateRank();
		}//
		System.out.println("Name\tMatches\tRank");
		for(int i=0 ;i<p; i++) {
			obj[i].display();
		}
		
	}//end of main
	
	void getData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name : ");
		name = sc.next();
		System.out.println("Enter the number of Matches Played");
		matchplayed = sc.nextInt();
		// next -> word 
		// nextLine -> line 
	}//end of getData()  
	
	void calculateRank() {
		if(matchplayed>=150) {
			rank =1;
		}
		else if(matchplayed>=100){
			rank = 3;
		}
		else if(matchplayed>=50) {
			rank = 5;
		}
		else if(matchplayed<50) {
			rank = 100;
		}
	}//end of calculateRank
	
	void display() {
		System.out.println(""+name+"\t"+matchplayed+"\t"+rank);
	}
}//end of class


//-------------------------
//create a class Cricketer 
//having 3 property
//name 
//matchPlayed
//rank 
//
//create functions 
//getData()
//
//calculateRank()
//
//	if match Played >= 150 
//		rank is 1
//	if matchPlayed >= 50
//		rank is 5
//	if matchPlayed >= 100
//		rank is 3
//	if matchPlayed < 50
//		rank is 100
//
//display()
//	output:
//	
//		Name 	    :  	Ram
//		MatchPlayed :   250
//		Rank	    :   1