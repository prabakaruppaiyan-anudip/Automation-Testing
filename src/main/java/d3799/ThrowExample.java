package d3799;

public class ThrowExample {
	static void validName(String s)
	{
		try {
			throw new NullPointerException("Name should not be null");
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		int age=15;
		try {
		if(age<=18)
			throw new ArithmeticException("Invalid age");
		else
			System.out.println(age);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Invalid Age");
		}
		String s=null;
		validName(s);
		System.out.println("Program ended");
	}

}
