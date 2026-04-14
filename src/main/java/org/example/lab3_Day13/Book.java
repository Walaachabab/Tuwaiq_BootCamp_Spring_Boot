package org.example.lab3_Day13;
import java.util.ArrayList;

public class Book extends Media{

   private int stock;
   private ArrayList<Review> reviews;


//
//    public Book(String titel, String autheur, String ISBN, double price, int stock) {
//        super(titel, autheur, ISBN, price);
//        this.stock = stock;
//        this.reviews = reviews;
//    }


    public Book(String titel, String autheur, String ISBN, double price, int stock) {
        super(titel, autheur, ISBN, price);
        this.stock = stock;
        this.reviews = new ArrayList<>();
    }



    public ArrayList<Review> getReviews() {
        return reviews;
    }

    public void setReviews(ArrayList<Review> reviews) {
        this.reviews = reviews;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    // method 1
    public void addReview(Review review){
        reviews.add(review);
    }

    // method 2
    public double getAverageRating(){
        double sum = 0;
       if(reviews.isEmpty()) return 0.0;
       for (Review r : reviews){
           sum += r.getRating();
       }
        return sum / reviews.size();
    }

    // method 3

    public boolean isBestSaller(){
     return getAverageRating() >= 4.5;
    }

    // method 4
    public void restock(int quantity){
        this.stock += quantity;
        System.out.println("Restocked: " + getTitel() + ". New stock: " + this.stock);
    }


    // method 5
    public void purchase(User user) {
        if (this.stock > 0) {
            user.addToPurchasedMedia(this);
            this.stock--;
            System.out.println("Purchase successful: " + getTitel());
        } else {
            System.out.println("Sorry, " + getTitel() + " is out of stock.");
        }
    }


// overridd
    public String getMediaType() {
        if (getAverageRating() >= 4.5) {
            return "Bestselling Book";
        } else {
            return "Book";
        }

    }

    public String toString() {
        return super.toString() + " [Stock=" + stock + ", Avg Rating=" + getAverageRating() + ", Type=" + getMediaType() + "]";
    }



}
