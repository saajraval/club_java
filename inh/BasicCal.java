package club_java.inh;

public class BasicCal {

	void add(int a,int b) {
		int c ;
		c= a+b;
		System.out.println(" SUM : "+c);
	}//end of add 
	
}//end of class

class SciCal extends BasicCal{
	
	public static void main(String[] args) {
		SciCal s = new SciCal();
		s.add(3,4);
		s.squareRoot(9);
	}//end of main
	
	void squareRoot(double x) {
		double ans = Math.sqrt(x);
		System.out.println("Square Root : "+ans);
	}
}//end of class 