package oops;
class EmpSystem
{
	int eid;
	String ename;
	String desgn;
	double salary;
	EmpSystem()
	{
		eid=101;
		ename="Vanitha";
		desgn="Teacher";
		salary=80000;
	}
	void display(int id)
	{
		eid=id;
		System.out.println(eid);
	}
	void display(String en, String dn)
	{   ename=en;
	    desgn=dn;
		System.out.println(ename);
		System.out.println(desgn);
	}
	void display(double salary)
	{
		this.salary=salary;
		System.out.println(salary);
	}
}
public class WithoutPolymorphism {

	public static void main(String[] args) {
		EmpSystem emp=new EmpSystem();
		emp.display(101);
		emp.display("Vanitha", "Teacher");
		emp.display(80000);

	}

}
