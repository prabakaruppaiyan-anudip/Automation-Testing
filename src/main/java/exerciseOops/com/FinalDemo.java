package exerciseOops.com;
final class Super
{
	final int count=10;
	Super()
	{
		
	}
	final void setCount()
	{
		System.out.println("This is parent class method");
	}
}
class Child 
{
	void setCount1()
	{
		System.out.println("This is child class method");
		
	}
}
public class FinalDemo {

	public static void main(String[] args) {
		Child c=new Child();
		
		c.setCount1();
		

	}

}
