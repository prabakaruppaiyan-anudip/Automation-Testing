package basics;

public class Conversion {

	public static void main(String[] args) {
		char ch='t';
		System.out.println((char)((int)ch-32));//(char)84
		//alternate method
		int ascii=ch;
		ch=(char)(ascii-32);
	}

}
