package org.example.Account_Employee;

public class Employee {

    // Attributes
    private String id;
    private String name;
    private int salary;

    // Constructor
    public Employee(String id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // getters
    public String getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }


    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    //  Methods
    public int getAnnualSalary() {
        return salary * 12;
    }

    public int raisedSalary(int percent) {
        int increase = (salary * percent) / 100;
        salary += increase;
        return salary;
    }

    @Override
    public String toString() {
        return "Employee[id=" + id + ", name=" + name + ", salary=" + salary + "]";

    }
}