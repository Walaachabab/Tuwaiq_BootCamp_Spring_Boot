package org.example.Exercise_Abstraction;

public class Book extends Product{

    private String author;

    public Book() {}

    public Book(String name, double price, String author) {
        super(name, price);
        this.author = author;
    }

    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }

    @Override
    public double getDiscount() {
        return getPrice() * 0.85;
    }


    // Extra
    @Override
    public double getShippingCost() {
        return 5.0;
    }

    @Override
    public double getTax() {
        return getPrice() * 0.15;
    }

    @Override
    public String getDeliveryTime() {
        return "3 to 5 business days";
    }




}
