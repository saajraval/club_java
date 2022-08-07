package club_java.inh;

public class SingleInhDemo {
	
	SingleInhDemo() {
		System.out.println(" Default : Parent !!");
	}
	SingleInhDemo(int a){
		System.out.println(" Para : Parent !! Value : "+a); 
	}
	public static void main(String[] args) {
//		SingleInhDemo s = new SingleInhDemo(7);
		Child c = new Child("Raj");

	}//end of main
}//end of class 

class Child extends SingleInhDemo{
	Child(){
		System.out.println("Default : Child !!");
	}
	Child(String name){
		System.out.println("Para : Child !! Value : "+name);
	}
	
	
}//end of child class
// public class A : public B

// Constructor :  A Special method that has the same name as that of the class name that is used to initialize values 

// 2 types : Default , Parameterized 