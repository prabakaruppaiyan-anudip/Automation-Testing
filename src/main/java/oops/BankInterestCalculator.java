package oops;

class BankInterestCalculator {

    // 1️⃣ Savings Account - Simple Interest
    double calculateInterest(double principal, double rate, double time) {
        // Simple Interest = (P * R * T) / 100
        double interest = (principal * rate * time) / 100;
        System.out.println("Savings Account Interest: " + interest);
        return interest;
    }

    // 2️⃣ Fixed Deposit - Compound Interest
    double calculateInterest(double principal, double rate, double time, int compoundingPerYear) {
        // Compound Interest = P * (1 + r/n)^(n*t) - P
        double amount = principal * Math.pow((1 + rate / (100 * compoundingPerYear)), compoundingPerYear * time);
        double interest = amount - principal;
        System.out.println("Fixed Deposit Interest: " + interest);
        return interest;
    }

    // 3️⃣ Recurring Deposit - Monthly Deposit
    double calculateInterest(double monthlyDeposit, int months, double rate) {
        // Formula for RD = P * n(n+1)r / (2*12*100)
        double interest = (monthlyDeposit * months * (months + 1) * rate) / (2 * 12 * 100);
        System.out.println("Recurring Deposit Interest: " + interest);
        return interest;
    }

    public static void main(String[] args) {
        BankInterestCalculator bank = new BankInterestCalculator();

        bank.calculateInterest(10000, 5, 2);                   // Savings
        bank.calculateInterest(50000, 6.5, 3, 4);              // FD
        bank.calculateInterest(2000, 24, 7.0);                 // RD
    }
}
