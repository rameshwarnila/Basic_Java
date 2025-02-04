package ex_04_Variables;

public class LAB003_Static_Variable {

	static int year = 2005;
	static long data = 4500;
	static String name="I like java programming.";
	
	
	public static void data () {
		
		System.out.println(year);
		
	}
	
	public void programme() {
		
		System.out.println(name);
	}
	
	public static void main(String[] args) {

		System.out.println(data);
		data();
		LAB003_Static_Variable from = new LAB003_Static_Variable();
		from.programme();
	}
	
}
