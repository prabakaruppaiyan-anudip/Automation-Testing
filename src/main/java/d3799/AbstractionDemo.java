package d3799;
abstract class Bank {
    abstract void calculateInterest();  // what to do (rule)
    
    void displayBankName() {            // how (common method)
        System.out.println("Bank Processing");
    }
}

class SBI extends Bank {
	void calculateInterest() {          // how to do (SBI’s own logic)
        System.out.println("SBI Interest: 7%");
    }
    
}

class HDFC extends Bank {
    void calculateInterest() {          // HDFC’s own logic
        System.out.println("HDFC Interest: 8%");
    }
}

public class AbstractionDemo {
    public static void main(String[] args) {
        Bank b1 = new SBI();
        b1.displayBankName();
        b1.calculateInterest();

        Bank b2 = new HDFC();
        b2.displayBankName();
        b2.calculateInterest();
    }
}
