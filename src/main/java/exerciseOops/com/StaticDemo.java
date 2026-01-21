package exerciseOops.com;
class Demo
{
	static boolean f;
	static void show()
	{
		System.out.println("This is static show method in different class ");
	}
	void message()
	{
		
	}
}

public class StaticDemo {
	static String college_name="SVCE";
    static void display()
    {
    	System.out.println("College Name is "+college_name);
    }
    void calculate()//non-static method
    {
    	display();
    	Demo d=new Demo();
    	d.message();
    }
	public static void main(String[] args) {
		StaticDemo s=new StaticDemo();
		Demo d=new Demo();
		System.out.println(college_name);
		display();
		Demo.show();
		Demo.f=true;
		s.calculate();
		d.message();
		
        
	}

}
