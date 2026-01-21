package oops;
class Student
{
	//Display student id
	public void display(int sid)	{
		System.out.println("Student id is "+sid);
	}
	//Display student address
	public void display(String address)
	{
		System.out.println("Address is "+address);
	}
	//Display student id and name
	public void display(int sno, String sname)
	{
		System.out.println("Student id is "+sno);
		System.out.println("Student Name is "+sname);
	}
	//Display Student id and age
	public void display(int sid, int age)
	{
		System.out.println("Student id is "+sid);
		System.out.println("Student age is "+age);
	}
	public void display(String address, int pincode)
	{
		
		System.out.println("Address is "+address);
                System.out.println("Pincode is "+pincode);
	}

}

public class StudentInfo {

	public static void main(String[] args) {
         Student s=new Student();
         System.out.println("Display Student id");
         s.display(101);
         System.out.println("Display student address");
         s.display("C.V.Raman Nagar, Bangalore");
         System.out.println("Display Student id with name ");
         s.display(102, "Praba");
         System.out.println("Display Student id with age");
         s.display(103, 15);
         s.display("Bangalore", 560093);
         

	}

}
