package ex_04_Variables;

public class LAB001_Local_Variable {
	
	// This variable is declared inside the method body. 
	// Other methods are not even aware about these variables. 
	
	public static void local() {
			
		int age = 60;
		long current_year=2025;
		
		System.out.println("My DOB : "+ (current_year - age));
	}
	
	public static void main(String[] args) {
		
		local();
		
	}

}
