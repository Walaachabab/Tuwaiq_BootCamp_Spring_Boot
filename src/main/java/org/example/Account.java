package org.example;

public class Account {

    private String name;
    private String id;
    private int balance = 0;

    // Constructor 1
    public Account(String id, String name) {
        this.id = id;
        this.name = name;
    }

    //  Constructor 2

    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;

    }

    public void setName(String name) {
        this.name = name;

    }


    public void setId(String id) {
        this.id = id;
    }


    public void setBalance(int balance) {
        this.balance = balance;
    }


    public String getName() {
        return name;
    }

    public String getId() {

        return id;
    }

    public int getBalance() {

        return balance;
    }


// methods

    public int credit(int amount) {
        balance = +amount;
        return balance;
    }


    public int debit(int amount) {
        if (amount <= balance) {
            balance = -amount;
        } else {
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }




    public int transferTo(Account another , int amount){

        if (amount <= balance){
            this.debit(amount);
            another.credit(amount);
        }else {
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }


public String toString(){
    return "Account[id=" + id + ", name=" + name + ", balance=" + balance + "]";
}













}