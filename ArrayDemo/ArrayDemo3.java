package club_java.ArrayDemo;
//scan display reverse sort 
// 
import java.util.Scanner;
public class ArrayDemo3{
//	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		ArrayDemo3 obj = new ArrayDemo3();
		System.out.println("\n Enter the size of the array : ");
//		int size = obj.sc.nextInt();
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int a []= new int [size];
		boolean flag =false;// false true 
		while(true) {
			System.out.println("\n1 -> Scan \n2 -> Display\n3 -> Reverse\n 4 ->Sort \n0 -> Exit \n Enter your choice :");
			int choice = sc.nextInt();
			switch(choice) {
				case 1: obj.scan(a, size);
						flag = true;
						break;
				case 2:	if(flag) {	
							obj.display(a, size);
						}
						else {
							System.out.println("Scan the array first !!");
						}
						break;
				case 3:	if(flag) {	
							obj.reverse(a, size);
						}
						else {
							System.out.println("Scan the array first !!");
						}
						break;
				case 4:	if(flag) {	
							System.out.println("\n 1 -> Ascending order \n 2 -> Descending order \n Enter your chocice");
							int choice1 = sc.nextInt();
							if(choice1 == 1) {
								obj.sort(a, size);
								obj.display(a, size);
							}
							else if(choice1 == 2) {
								obj.sort(a, size);
								obj.reverse(a, size);
							}
						}
						else {
							System.out.println("Scan the array first !!");
						}
						break;
			
				case 2-2:System.exit(0);
			}
		}
	}//end of main
	
	// 12 3 1 4 -> 4 1 3 12
	
	void scan(int a[], int size) {
		Scanner sc = new Scanner (System.in);
		for(int i =0 ;i<size;i++) {
			System.out.println("a["+i+"]: ");
			a[i] = sc.nextInt();
		}
	}//end of scan
	
	void display(int a[],int size ) {
		Scanner sc = new Scanner (System.in);
		System.out.println("The array is : \n");
		for(int i =0 ;i<size;i++) {
			System.out.print(" "+a[i]);
		}
	}//end of display 
	
	void reverse (int a[],int size) {
		Scanner sc = new Scanner (System.in);
		System.out.println("The array is : \n");
		for(int i =size -1 ;i>=0;i--) {
			System.out.print(" "+a[i]);
		}
	}//end of reverse

	void sort(int a[],int size) {
		for(int i=0;i<size;i++) {
			for(int j=0;j<size-1;j++) {
				if(a[j]>a[j+1]) {// 10 5
					a[j]= a[j]+ a[j+1]; // 10+ 5 = 15 
					a[j+1]= a[j]-a[j+1];//15- 5 =10 
					a[j]=a[j]-a[j+1];// 15 - 10 = 5 
				}//end of if
			}//end of inner for
		}//end of outer for
	}//end of sort 
}//end of class
