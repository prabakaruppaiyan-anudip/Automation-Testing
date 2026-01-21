package oops;
class Parent1
{
	String house_type="individual";

	
	  Parent1(String house_type) { this.house_type=house_type; }
	 
	public void display()
	{
		System.out.println(house_type);
	}
}
class Parent2 
{
	String house_type1;
	Parent2()
	{
		System.out.println("Parent2 constructor");
	}
	public void display()
	{
		System.out.println(house_type1);
	}
}
class Child1 extends Parent2
{
	
	String house_type2;
	Child1()
	{   house_type2="modern house";
		System.out.println("This is child1 class");
	}
	public void display()
	{
		System.out.println(house_type2);
	}
}

public class MultiLevel {

	public static void main(String[] args) {
		Child1 ch=new Child1();
		ch.display();//overriding the parent method
		
	}

}
