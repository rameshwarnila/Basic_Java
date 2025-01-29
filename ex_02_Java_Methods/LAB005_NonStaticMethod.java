package ex_02_Java_Methods;

public class LAB005_NonStaticMethod {

	public static void main(String[] args) {
		
		System.out.println("Non Static Method Execution");
		
	/*
		* Syntax for creating object reference variable.
		* Object Purpose - To Call Non Static Method Only 
		* Object is Directly Proportional to Class
		* Std Syntax to Create Object 
		* ClassName refernaceVariable = new(Keyword) Constructor();
		* ClassName ObjectrefVariable = new ClassName();
		* NonStaticMethod from = new NonStaticMethod ();
		* How to call Non Static Method in Main Method ?
		* ObjectRefVariable.MethodName with Signature followed By Semicolon

	*/
	
		LAB005_NonStaticMethod from =new LAB005_NonStaticMethod();
		
		from.method_1();
		from.method_2();
		
	}
	
	
	public void method_1() {
		
		System.out.println("There is no static word in method synax.");
	}
	
	public void method_2() {
		
		System.out.println("We Can call Non Static Method using Object in main method.");
	}
}
