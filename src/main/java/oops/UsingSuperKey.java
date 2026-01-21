package oops;
class Person
{
	long aadhar_id;
	Person()
	   {
	      System.out.println("This is Person constructor");
	   }

	Person(long id)
	{
		aadhar_id=id;
	}
	void display()
	{
	 System.out.println("Citizen Aadhar id is "+aadhar_id);
	}
}
class Citizen extends Person
{
	String cname;
	int age;
	Citizen()
    {
      System.out.println("This is Citizen constructor");
    }

	Citizen(String cn, int a, long aid)
	{
		super(aid);//calling parent constructor
		//super.aadhar_id=aid; //accessing parent member
		cname=cn;
		age=a;
	}
	void setInfo(String cn, int a, long aid)
    {
      super.aadhar_id=aid;
      cname=cn;
      age=a;
    }
	void display()
	{
		System.out.println("Citizen name is "+cname);
		System.out.println("Citizen age is "+age);
		super.display();//calling parent method
		
	}
	
}
public class UsingSuperKey {

	public static void main(String[] args) {
		Citizen cn=new Citizen();
		
		  Citizen c=new Citizen("Vanitha", 35,45353345); 
		  c.display();
		 // c.setInfo("Vijaya",38,13345323); c.display();
		 



	}

}
