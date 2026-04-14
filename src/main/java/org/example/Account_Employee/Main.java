package org.example.Account_Employee;

public class Main {
    public static void main(String[] args) {
// Account
        Account acc1 = new Account("101", "Ahmed", 5000);
        Account acc2 = new Account("102", "Sara", 3000);
        Account acc3 = new Account("103", "Khalid", 1000);

        System.out.println("--- Initial Account Status ---");
        System.out.println(acc1.toString());
        System.out.println(acc2.toString());
        System.out.println(acc3.toString());

        //  Credit (Deposit) to Khalid
        acc3.credit(2000);
        System.out.println("\nAfter depositing 2000 into Khalid's account: " + acc3.getBalance());

        //  Debit (Withdrawal) from Sara
        acc2.debit(500);
        System.out.println("After withdrawing 500 from Sara's account: " + acc2.getBalance());


        acc1.transferTo(acc3, 1500);
        System.out.println("\nAfter transferring 1500 from Ahmed to Khalid:");
        System.out.println("Ahmed's Balance: " + acc1.getBalance());
        System.out.println("Khalid's Balance: " + acc3.getBalance());

        // Transfer from Sara to Ahmed
        acc2.transferTo(acc1, 1000);
        System.out.println("\nAfter transferring 1000 from Sara to Ahmed:");
        System.out.println("Sara's Balance: " + acc2.getBalance());
        System.out.println("Ahmed's Balance: " + acc1.getBalance());

        System.out.println("\n--- Final Account Status ---");
        System.out.println(acc1.toString());
        System.out.println(acc2.toString());
        System.out.println(acc3.toString());

        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

// employee


        Employee emp1 = new Employee("E101", "Saleh", 4000);
        Employee emp2 = new Employee("E102", "Noura", 6000);
        Employee emp3 = new Employee("E103", "Fahad", 3500);

        System.out.println("--- Initial Employee List ---");
        System.out.println(emp1.toString());
        System.out.println(emp2.toString());
        System.out.println(emp3.toString());

        //  Setters to update Employee 1
        emp1.setName("Saleh Mohammed");
        emp1.setSalary(4500);

        // a 15% raise to Employee 2 (Noura)
        emp2.raisedSalary(15);

        //  a 10% raise to Employee 3 (Fahad)
        emp3.raisedSalary(10);
        System.out.println("\n--- Updated Employee Status ---");

        // employee 1
        System.out.println("Employee 1 (Updated Info): " + emp1.getName() + " | Salary: " + emp1.getSalary());

        // employee 2
        System.out.println("Employee 2 (After 15% Raise): " + emp2.getName() + " | Annual Salary: " + emp2.getAnnualSalary());

        // employee 3
        System.out.println("Employee 3 (After 10% Raise): " + emp3.getName() + " | Annual Salary: " + emp3.getAnnualSalary());

        System.out.println("\n--- Final toString Output ---");
        System.out.println(emp1.toString());
        System.out.println(emp2.toString());
        System.out.println(emp3.toString());
    }
}
