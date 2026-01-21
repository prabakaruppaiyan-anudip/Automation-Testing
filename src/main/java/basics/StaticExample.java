package basics;
class Student
	 { 
	   int rno, age; //instance variables
	   static String clg="SKTcollege"; //static variable
	   static String city="Chennai/HYD"; // static variable
	  public void m1()
	  { 
	   int x=500;//local variable
	   System.out.println(x);
	  }
	 }
 public class StaticExample {
	  public static void main(String[] args)
	  {
	   Student s1=new Student();
	   Student s2=new Student();
	   s1.rno=301;
	   s1.age=23;
	   s2.rno=302;
	   s2.age=25;
	   System.out.println(s1.rno+s1.age+Student.clg+Student.city);
	   System.out.println(s2.rno+s2.age+Student.clg+Student.city);
	 }
	} 


