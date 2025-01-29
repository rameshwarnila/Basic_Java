package ex_02_Java_Methods;

public class LAB007_StaticNonStaticMethod {

	
	public static void main(String [] args) {
		
		LAB007_StaticNonStaticMethod from =new LAB007_StaticNonStaticMethod();
		
		from.nonstaticMethod();
		staticMethod();
	}
	
	public static void staticMethod() {
		System.out.println("We can call static as well as non satic method.");
	}
	
	
	public void nonstaticMethod() {
		System.out.println("This class will end the method practices.");
	}
}
