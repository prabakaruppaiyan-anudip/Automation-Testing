package oops;
class EmployeeInfo
{
	void displayName(String name)
	{
		System.out.println("Employee Name is "+name);
	}
	void displayIdName(int id, String name)
	{
		System.out.println("Employee id is "+id);
		System.out.println("Employee Name is "+name);
	}
	void displaySalary(double salary)
	{
		System.out.println("Employee salary is "+salary);
		
	}
}

public class EmployeeSystem {
	

	public static void main(String[] args) {
		EmployeeInfo e=new EmployeeInfo();
		e.displayName("Shanvi");
		e.displayIdName(101,"Mahizhan");
		e.displaySalary(100000);

	}

}
