package club_java.Basics;
import java.util.Scanner;
public class Employee {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		EmployeePayRoll emp[] = new EmployeePayRoll[2];
		int count =0;
		while(true) {
			System.out.println("\n1 -> Enter you Data \n2 -> Display \n 0-> Exit");
			int choice = sc.nextInt();
			switch (choice) {
			case 1 : emp[count] = new EmployeePayRoll();
					emp[count].getData();
					count++;
					break;
			case 2: for(int i=0;i<count;i++) {
						emp[i].calculateSalary();
					}	
					for(int i=0;i<count;i++) {
						emp[i].printData();
					
					}
				break;
			case 0: System.exit(0);
			}//end of switch
		}//end of while
	}//end of main
}//end of class

class EmployeePayRoll{
	int salary ;
	
	String name;
	double tax , bonus , pf ,da ,hra ,totalSalary;
	void getData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of the employee");
		name = sc.nextLine();
		System.out.println("Enter your Salary : ");
		salary = sc.nextInt();
	}//end of getData
	
	void calculateSalary() {
		if(salary > 15000) {
			tax = 1000;
		}
		else if(salary > 50000) {
			tax = 2000;
		}
		pf = salary * 0.12;
		hra = salary *0.05;
		da = salary * 0.05;
		bonus = salary * 0.07;
		totalSalary = salary + bonus -tax -da + hra  -pf ;
	}//end of calculateSalary
	
	void printData()
	{
		System.out.println(" Name  \t Salary \t tax \t Bonus \t TotalSalary ");
		System.out.println(" "+name+" \t"+salary+" \t"+tax+" \t"+bonus+" \t"+totalSalary);
	}//end of printData
}// end of EmployeePayRoll

