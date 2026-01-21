package basics;
class Test2
{
	protected void showTest2()
	{
		System.out.println("This is a protected method");
	}
}
class Test3 extends Test2
{
	void access_protected()
	{
		showTest2();
	}
}

public class ExampleProtected extends ProtectedClass{

	public static void main(String[] args) {
	  	 Test2 t=new Test2();
	  	 t.showTest2();
	  	 
	  	 
	  	 
       
	}

}
