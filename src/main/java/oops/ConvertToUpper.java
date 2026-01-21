package oops;

public class ConvertToUpper {

	public static void main(String[] args) {
		String s="selenium";
		String res="";
		for(int i=0; i<s.length(); i++)
		{
			char ch=(char) ((int)s.charAt(i)-32);
			//System.out.print(ch);
			res=res+ch;
		}
		System.out.println(res);
		
		char[] arr = s.toCharArray();
		for(char c : arr){
		    System.out.println(c);
		}
		Integer b=new Integer(100);
		String r=b.toString();
		System.out.println(r);


	}

}
