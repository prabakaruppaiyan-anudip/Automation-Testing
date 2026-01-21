package oops;
class Base
{
	int no_of_vehicles;
	int no_of_houses;
	
	void setBaseData()
	{
		no_of_vehicles=2;
		no_of_houses=3;
	}
	void display()
	{
		System.out.println("Number of Vehicles "+no_of_vehicles);
		System.out.println("Number of Houses "+no_of_houses);
	}
}

public class Derieved extends Base{
	int vehicles;
	void setDerievedData()
	{
		vehicles=3;
	}
    void show()
    
    {
		System.out.println("Number of Vehicles "+vehicles);
    }
	public static void main(String[] args) {
		Derieved d=new Derieved();
		d.setBaseData();
		d.display();
		d.setDerievedData();
		d.show();

	}

}
