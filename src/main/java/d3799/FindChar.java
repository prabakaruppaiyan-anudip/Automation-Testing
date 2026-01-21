package d3799;

import java.util.Scanner;

public class FindChar {

	public static void main(String[] args) {
		char ch[]= {'a','t','y','w','q'};
		Scanner sc=new Scanner(System.in);
		char c;
		int f=0;
		c=sc.next().charAt(0);
		for(int i=0; i<ch.length;i++)
		{
			if(c==ch[i])
			{   f=1;
				System.out.println("character found");
				break;
			}
		}
		if(f==0)
		  System.out.println("Character doesn't exist");
		int count=0;
		for(int i=0; i<ch.length; i++)
		{
			if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
				count++;
		}
		System.out.println("Number of vowels in the array "+count);
	}
}
