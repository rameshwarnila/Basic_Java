package ex_04_Variables;

public class LAB002_Instance_Variable {

    /*
	 * Instance variable is also called as global variable. 
	 * It is only used inside non static method.
	 * It is declared inside class body and outside of method body. 
	 */
	
	int currentdate =20250204; // yyyymmdd
	int dob =19960506; //yyyymmdd
	
	public void instance() {

		System.out.println(currentdate - dob);
	}
	
	public static void main (String [] args) {
		
		LAB002_Instance_Variable from = new LAB002_Instance_Variable();
		
		from.instance();
		
	}
}
