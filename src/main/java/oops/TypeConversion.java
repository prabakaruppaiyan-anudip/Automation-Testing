package oops;

import java.util.Scanner;

public class TypeConversion {
  public static void main(String args[])
  {
	  double d = 10.75;
	  int a = (int) d;//typecasting
	  System.out.println(a);//10
	  
	  int a1= 10;
	  double d1= 10;   // automatic
	  System.out.println(d1);//10
	  char c='z';
	  int value=c;
	  System.out.println(value);
	  int num=97;
	  c=(char)num;
	  System.out.println(c);
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the student id");
	  int sid=sc.nextInt();//integer
	  String sname=sc.next();//string
	  char isEligible=sc.next().charAt(0);//character
	  boolean flag=sc.nextBoolean();//boolean
	  String feedback=sc.nextLine();
	  System.out.println("Student id is "+sid);
	  System.out.println("Student name is "+sname);
	  System.out.println("Student is eligible "+isEligible);
	  System.out.println(flag);
	  System.out.println("Feedback about student is "+feedback);	  
	  
      
  }
}
