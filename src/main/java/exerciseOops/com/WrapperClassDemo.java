package exerciseOops.com;

public class WrapperClassDemo {

	public static void main(String[] args) {
		char c='a';
		Character obj=c;//autoboxing
		if(obj.isUpperCase(c))
			System.out.println("It is upper case letter");
		else
			System.out.println("It is not upper case letter");
		c=obj;
		}

}
