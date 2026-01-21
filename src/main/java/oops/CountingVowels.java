package oops;

import java.util.Scanner;

public class CountingVowels {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char ch[]=new char[10];
		System.out.println("Enter the character ");
		//storing characters into the array
		for(int i=0; i<ch.length; i++)
		{
			ch[i]=sc.next().charAt(0);
		}
		int c=0;
		for(int i=0; i<ch.length; i++)
		{
			if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
                c++;
		}
		System.out.println("Number of vowels in array "+c);
			
		}
		
	}

