package oops;
class Example
{
	void showInfo()
	{
		System.out.println("This is showInfo ");
	}
	void findEven(int x)
	{
		if(x%2==0)
			System.out.println(x+ " is a even number");
		else
			System.out.println(x+ " is not a even number");
			
	}
	boolean isEven(int x)
	{
		return(x%2==0);
	}
}

public class MethodExample {
		 int sid;
		 String sname;

		   static void display()
		    {
		      System.out.println("Students are attending offline session sincerely");
		    }
		void show()
		 {
		   display();

		 }
		   
		   public static void main(String args[])
		    {
			   MethodExample m=new MethodExample();
			  display();
			  m.show();
			  Example e=new Example();
			  e.showInfo();
			  e.findEven(9);
			  System.out.println(e.isEven(3));
			  
		      System.out.println("This is main method");
		      
		    }
		}


