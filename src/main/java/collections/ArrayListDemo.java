package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(100);
		al.add("Shanvi");
		al.add(false);
		al.add(5.6);
		System.out.println(al);
		Iterator it=al.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		//Remove item from array list
		al.remove(1);
		System.out.println(al);
		al.add(1, "Python");
		System.out.println(al);
		//modify or update
		al.set(0, "C++");
		System.out.println(al);
		System.out.println(al.contains("Python"));
		System.out.println(al.isEmpty());
		for(int i=0; i<al.size(); i++)
			System.out.println(al.get(i));
		al.add(false);
		ArrayList dup=new ArrayList();
		dup.addAll(al);
		System.out.println(dup);
		dup.removeAll(dup);
		System.out.println(dup);
		dup.add("xerox");
		dup.add("printout");
		dup.add("copy");
		Collections.sort(dup);
		System.out.println(dup);
		Collections.sort(dup,Collections.reverseOrder());
		System.out.println(dup);
		Collections.shuffle(dup);
		System.out.println(dup);
		

	}

}
