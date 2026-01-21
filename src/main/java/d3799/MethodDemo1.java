package d3799;

public class MethodDemo1
{
  public static void display()
   {
     System.out.println("*********************************");
     System.out.println("---------------------------------");
   }
  public static void show(String msg)
  {
	  System.out.println(msg); 
	  }
   public static int add(int x, int y)
   {
	   return(x+y);
   }
  public static void main(String args[])
   {
     display();
     System.out.println("Program Started");
     System.out.println("Welcome to Java Programming");
     display();
     System.out.println("Program Ended");
     display();
     show("Welcome Back");
     int a=4;
     int b=6;
     int result=add(a,b);
  
   }
}
