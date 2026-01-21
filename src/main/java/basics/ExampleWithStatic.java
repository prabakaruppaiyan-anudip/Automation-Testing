package basics;

public class ExampleWithStatic {
	static {
	    System.out.println("This is static block 1");
}

	public static void main(String[] args) {
		
		System.out.println("This is static main method");

	}
	
	static {
		System.out.println("This is static block 2");
	}

}
