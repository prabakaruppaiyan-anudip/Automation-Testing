package d3799;

public class SumOfDigits {

	public static void main(String[] args) {
		int n=13452,s=0;
		while(n>0)
		 {
		  int r;
		  r=n%10;
		  System.out.println(r);
		  s=s+r;
		  n=n/10;
		  System.out.println(n);
		 }
		System.out.println(s);
	}

}
