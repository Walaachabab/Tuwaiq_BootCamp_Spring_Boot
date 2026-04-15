package org.example.Exercise_Abstraction;

public class Movie extends Product{

    private String director;

    public Movie(){}

    public Movie(String name, double price, String director) {
        super(name, price);
        this.director = director;
    }

    public String getDirector() { return director; }
    public void setDirector(String director) { this.director = director; }

    @Override
    public double getDiscount() {
        return getPrice() * 0.90;
    }

    // Extra
    @Override
    public double getShippingCost() {
        return 10.0;
    }

    @Override
    public double getTax() {
        return getPrice() * 0.15;
    }


    @Override
    public String getDeliveryTime() {
        return "1 to 2 business days (Express)";
    }





}
