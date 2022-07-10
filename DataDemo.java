package club_java;

public class DataDemo {
//	Primitive:
//	byte -> 0 
//	short-> 0   -128 + 128
//	char -> null
//	int -> 0
//	long  0
//	float 0.0f
//	double 0.0
//	boolean false
//	
	
	// non primitive :
//	array , strings 
	byte b;
	short s;
	char ch;
	int i;
	long l;
	float fl;
	double d;
	
	boolean flag ;
	
	void display() {
		System.out.println(b);
		System.out.println(s);
		System.out.println(ch);
		System.out.println(i);
		System.out.println(l);
		System.out.println(fl);
		System.out.println(d);
		System.out.println(flag);
	}
	public static void main(String[] args) {
		
		DataDemo obj = new DataDemo();
		obj.display();
	}//end of main
	
}//end of class
