package oops;
//Parent class
class Bank1 {
 // Method to be overridden
 double getRateOfInterest() {
     return 0.0;
 }
}

//Child class 1
class SBI extends Bank1 {
 // Overriding the parent method
 double getRateOfInterest() {
     return 6.5;
 }
}

//Child class 2
class ICICI extends Bank1 {
 double getRateOfInterest() {
     return 7.0;
 }
}

//Child class 3
class HDFC extends Bank1 {
 double getRateOfInterest() {
	 return (super.getRateOfInterest());
 }

}

//Main class
public class TestBank {
 public static void main(String[] args) {
     SBI b1 = new SBI();   // Runtime Polymorphism
     ICICI b2 = new ICICI();
     HDFC b3 = new HDFC();
     
     

     System.out.println("SBI Rate of Interest: " + b1.getRateOfInterest() + "%");
     System.out.println("ICICI Rate of Interest: " + b2.getRateOfInterest() + "%");
     System.out.println("HDFC Rate of Interest: " + b3.getRateOfInterest() + "%");
 }
}
