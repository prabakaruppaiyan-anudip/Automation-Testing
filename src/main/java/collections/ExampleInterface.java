package collections;
interface Student
{
	final String college_name="SEA college";
	void calcluateMarks();
	
}
interface BcomStudent 
{
	void anualReport();
}
class ImpStudent implements Student
{
	@Override
	public void calcluateMarks() {
		System.out.println("This is calculate marks method");
		
	}

}
public class ExampleInterface {
	

	public static void main(String[] args) {
		//Student s=new Student();//can't instantiate the interface
		ImpStudent s1=new ImpStudent();//instantiate the class
		Student s=new ImpStudent();
		System.out.println(s1.college_name);
		s1.calcluateMarks();
		s.calcluateMarks();

	}

}
