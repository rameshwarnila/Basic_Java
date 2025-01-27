package ex_02_Java_Methods;

/**
 * Can we add two main methods?
 * Yes we can add two main methods in one programme. But we have to change name of main to some other. 
 * When we run the output We will get only one output. Which is of main method. Other main method will be
 * collected in garbage collector. 
 * 
 */
public class LAB001_MainMethod {

	public static void main (String [] args) {
	
		System.out.println("Main Method");
		
	}
	
	public static void main_a(String [] args) {
		
		System.out.println("Second Main Method");
	}
	
}
