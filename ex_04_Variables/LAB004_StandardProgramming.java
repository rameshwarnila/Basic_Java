package ex_04_Variables;

public class LAB004_StandardProgramming {

	//1. Declaration of variable
	
	int p;
	byte c;
	
	// 2. Initialization 
	// Constructor 
	// 1. To Initialize Data Member(Variable) of Class 
	// 2. To Load Non Static Method of a class into Object 
	
	public void call() {
		
		p=500;
		c=120;
		
		System.out.println(p+c);
	}
	
	public void target() {
		
		p=300;
		c=20;
		
		System.out.println(p+c);
	}
	
	 // 3. Usage
	
	public static void main(String [] args) {
		LAB004_StandardProgramming from = new LAB004_StandardProgramming();
		
		from.target();
		from.call();
		
	}
}
