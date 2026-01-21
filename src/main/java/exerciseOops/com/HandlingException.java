package exerciseOops.com;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HandlingException {

	public static void main(String[] args) throws InterruptedException   {
	   System.out.println("Program Started");
	   Thread.sleep(2000);//2 secs
	   String s;
	   Scanner sc=new Scanner(System.in);
	   s="java";
	   try {
	  System.out.println(s.length());
	   }
	   catch(ArithmeticException e)
	   {
		   System.out.println(e.getMessage());
	   }
	   catch(NullPointerException e)
	   {
		   System.out.println(e.getMessage());
	   }
	   finally {
		   s="selenium";
		   System.out.println(s);
	   }
	
	   System.out.println("Program Ended");
		/*
		 * Thread.sleep(2000); String s="Vandana"; try { System.out.println(s.length());
		 * }catch(Exception e) {
		 * 
		 * }
		 */
	}

}
