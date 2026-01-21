package oops;
class Animal
{
	public void eat()
	{
		System.out.println("Animals eat grass");
	}
	
}
class Dog extends Animal
{
	public void eat()
	{
		System.out.println("Dog eat meat");
	}
}

class Bear extends Animal
{
	public void eat()
	{
		//to access parent method
		super.eat();
		System.out.println("Bear eat fish");
		EmployeeInfo ei=new EmployeeInfo();
	}
}


public class UsingSuperKeyword {
	public static void main(String args[])
	{
	//Child class method overrides Parent class method
	Dog d=new Dog();
	d.eat();
	//child class method overrides Parent class method
	Bear b=new Bear();
	b.eat();
	
	
	}
	
	

}
