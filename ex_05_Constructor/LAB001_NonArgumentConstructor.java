package ex_05_Constructor;

public class LAB001_NonArgumentConstructor {

	/*
	 * There are 2 types of constructor. 
	 * 1. Default Constructor 
	 * 2. User Defined constructor
	 * 	A. Non argument constructor / Non parameterized constructor
	 *  B. Argument constructor / Parameterized constructor
	 */
	
	LAB001_NonArgumentConstructor(){
		
		System.out.println("This is a non argument constructor.");
	}
	
	public static void main(String[] args) {
	
		//Method_1 to call constructor
		
		new LAB001_NonArgumentConstructor();
		
		//Method_2 to call constructor
		
		LAB001_NonArgumentConstructor from = new LAB001_NonArgumentConstructor();
		

	}
}
