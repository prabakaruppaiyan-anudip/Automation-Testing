package oops;

class Teacher
{
	int id;
	String tname;
	String subject;
	Teacher()
	{
		id=102;
		tname="Vanitha";
		subject="English";
	}
	Teacher(int id, String tn, String ts)
	{
		id=id;
		tname=tn;
		subject=ts;
	}
	
	void display()
	{
		System.out.println("Teacher id is "+id);
		System.out.println("Teacher tname is "+tname);
		System.out.println("Subject is "+subject);
	}
}
public class ConstructorExample {

	public static void main(String[] args) {
		Teacher t=new Teacher();
		Teacher t1=new Teacher(103, "Vijaya", "AJP");
		
		t.display();
		t1.display();
       
	}
}
