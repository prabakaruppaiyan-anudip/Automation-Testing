package oops;

class Employee {
    double basicPay = 30000;

    void calculateSalary() {
        System.out.println("Employee Basic Salary: " + basicPay);
    }
}
class FullTimeEmployee extends Employee {
    double bonus = 10000;

    @Override
    void calculateSalary() {
        super.calculateSalary(); // reuse parent's logic
        double totalSalary = basicPay + bonus;
        System.out.println("Full-Time Employee Total Salary: " + totalSalary);
    }
}

class PartTimeEmployee extends Employee {
    double hourlyPay = 500;
    int hoursWorked = 40;

    @Override
    void calculateSalary() {
        super.calculateSalary(); // reuse parent's logic
        double totalSalary = hourlyPay * hoursWorked;
        System.out.println("Part-Time Employee Total Salary: " + totalSalary);
    }
}
public class SalarySystem {
    public static void main(String[] args) {
        Employee e1 = new FullTimeEmployee();
        Employee e2 = new PartTimeEmployee();

        System.out.println("--- Full-Time Employee ---");
        e1.calculateSalary();

        System.out.println("\n--- Part-Time Employee ---");
        e2.calculateSalary();
    }
}
