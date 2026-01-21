package d3799;

interface Payment {
    void pay();
}
interface Transfer extends Payment{
	void moneyTransfer();
}

class GooglePay implements Transfer {//multiple inheritance
     public void pay() {
        System.out.println("Payment using Google Pay");
    }
     public void moneyTransfer()
     {
    	 System.out.println("Money Transfer");
     }
}

class PhonePe implements Payment {
    public void pay() {
        System.out.println("Payment using PhonePe");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        Payment p = new GooglePay();
        GooglePay p1=new GooglePay();
        p.pay();
    }
}
