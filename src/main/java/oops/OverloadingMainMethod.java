package oops;

public class OverloadingMainMethod {

	public static void main(String[] args) {
		System.out.println("This is main method accessed by JVM");
		main();
		main("Method overloading");
	}
	
	public static void main()
	{
		System.out.println("This is main method without parameter");
	}
	public static void main(String msg)
	{
		System.out.println(msg);
	}
}
