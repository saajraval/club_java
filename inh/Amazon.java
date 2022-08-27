package club_java.inh;
import java.util.Scanner;

//Amazon sell products in their webapp , every Product has their name price and qty.
//some times amazon sell products which belongs to non mfg. by indian company. 
//for non mfg of indian product amazon charge import duty of 5%. 
//amazon also sell make in india product if product belongs to make in 
//india then
//amazon give discount of 5% in each product. 
//you need to design class , variable , methods .
//
//make use of inheritence and object array also.

//Amazon  Product -> price qty 
// nonin -> duty 
// in -> disc 

public class Amazon {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		IndianProduct ip[] = new IndianProduct[10];
		NonIndianProduct nip[] = new NonIndianProduct[10];
		int indCount =0,nindCount =0;
		while(true) {
			System.out.println("\n 1 -> Add \n 2 -> Display \n 0 -> Exit ");
			int choice = sc.nextInt();
			switch(choice) {
			case 1: System.out.println("\n 1 -> Indian Product \n 2 -> NonIndian Product ");
					int subchoice = sc.nextInt();
					if(subchoice ==1) {
						ip[indCount] = new IndianProduct();
						ip[indCount].getData();
						ip[indCount].calculateDiscount();
						indCount++;
					}
					else if (subchoice == 2) {
						nip[nindCount] = new NonIndianProduct();
						nip[nindCount].getData();
						nip[nindCount].calculateDuty();
						nindCount++;
					}
					break;
			case 2: System.out.println("Indian Products : \n");
					for(int i=0 ; i< indCount ;i++) {
						ip[i].display();
					}
					System.out.println("Non indian Product : ");
					for(int i=0 ; i< nindCount ;i++) {
						nip[i].display();
					}
					break;
			case 0: System.exit(0);
			}//end of switch 
		}//end of while
	}//end of main
}//end of Amazon

class Product{
	String name;
	int price,qty;
	Scanner sc = new Scanner(System.in);
	void getData() {
		System.out.println("Enter the name of the product : ");
		name=sc.next();
		System.out.println("Enter the price of the product : ");
		price = sc.nextInt();
		System.out.println("Enter the quantity of PRoduct : ");
		qty = sc.nextInt();
	}//end of getData
	
	void display() {
		System.out.println(" "+name+" "+qty+" "+price);
	}//end of display
}//end of Product 

class NonIndianProduct extends Product{
	int duty;
	double dutyPer;
	public NonIndianProduct() {
		this.dutyPer = 5;
	}
	void calculateDuty() {
		this.duty = (int)(this.price * this.dutyPer)/100;
	}
	void display() {
		super.display();
		System.out.println("Duty Tax : "+this.duty);
	}
}
class IndianProduct extends Product{
	int disc;
	double discPer;
	public IndianProduct() {
		this.discPer = 5;
	}
	void calculateDiscount() {
		this.disc = (int)(this.price * this.discPer)/100;
	}
	void display() {
		super.display();
		System.out.println("Discount : "+this.disc);
	}
}