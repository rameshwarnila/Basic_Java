package ex_02_Java_Methods;

public class LAB006_NonStaticMethod {
	
	public void A1() {
		System.out.println(5*4);
	}
	
	public void A2() {
		System.out.println(5+6*5);
	}

	
	public static void main(String [] args) {
		
		System.out.println("Basic Calculation :- ");
		
		LAB006_NonStaticMethod from =new LAB006_NonStaticMethod();
		
		from.A1();
		from.A2();
	}
}
