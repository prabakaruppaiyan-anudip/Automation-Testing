package collections;

import java.util.ArrayList;
import java.util.Arrays;

public class StringArrayToArrayList {

	public static void main(String[] args) {
		String arr[]= {"C","C++", "Java", "Python"};
		ArrayList al=new ArrayList(Arrays.asList(arr));
		System.out.println(al);

	}

}
