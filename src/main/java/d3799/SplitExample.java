package d3799;

public class SplitExample {

	public static void main(String[] args) {
		String s="Java_is_fun";
		String st[]=s.split("_");
		for(int i=0; i<st.length; i++)
		{
			System.out.println(st[i]);
		}
	}

}
