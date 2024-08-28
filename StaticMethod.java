package basic_java_codes;

public class StaticMethod {
	
	public static void main(String[] args) {
		
		methodname();
		methodname_1();
		
	}

	public static void methodname() {
		System.out.println("Methodname is a static method.");
	}
 
	public static void methodname_1() {
		System.out.println("There are two type of methods:-" + "\n"+"1.Static Method"+"\n"+"2.Non-Static Method");
	}
}

//How to call static method to main method?
//Method name with signature followed by semicolon 