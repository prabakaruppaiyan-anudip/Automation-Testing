package basics;

class Vehicle {
    void start() {
        System.out.println("Vehicle started");
    }
}

class Car extends Vehicle {
    void drive() {
        System.out.println("Car is being driven");
    }
}

class Bike extends Vehicle {
    void ride() {
        System.out.println("Bike is being ridden");
    }
}

class Truck extends Vehicle {
    void loadGoods() {
        System.out.println("Truck is loading goods");
    }
}
public class Main1 {
    public static void main(String args[]) {
        Car c = new Car();
        Bike b = new Bike();
        Truck t = new Truck();

        c.start();
        c.drive();

        b.start();
        b.ride();

        t.start();
        t.loadGoods();
    }
}