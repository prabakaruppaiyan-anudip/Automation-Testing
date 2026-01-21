package collections;

import java.util.ArrayList;

public class DemoArrayList {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(101);
		al.add("selenium");
		al.add(false);
		System.out.println(al);
		for(int i=0; i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		for(Object s:al)
		{
			System.out.println(s);
		}
		

	}

}
