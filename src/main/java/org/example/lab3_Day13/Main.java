package org.example.lab3_Day13;
import org.example.inhertance_Day12.Square;

public class Main {

    public static void main(String[] args) {

    Store myStore = new Store();
    Book book1 = new Book("Java Programming", "John Smith", "123-ABC", 50.0, 10);
    Novel novel1 = new Novel("The Great Adventure", "Sara Ali", "456-DEF", 30.0, 5, "Fantasy");
    Movie movie1 = new Movie("Inception", "Christopher Nolan", "789-GHI", 15.0, 148);
    Music music1 = new Music("Midnight City", "M83", "000-XYZ", 5.0, "M83");

        myStore.addMedia(book1);
        myStore.addMedia(novel1);
        myStore.addMedia(movie1);
        myStore.addMedia(music1);

        User user1 = new User("Walaa", "walaa@example.com");
        myStore.addUser(user1);

        System.out.println("--- Welcome to the Store ---");
        myStore.displayMedias();

        System.out.println("\n--- Shopping Process ---");
        user1.addToCart(book1);
        user1.addToCart(novel1);


        user1.removeFromCart(novel1);
        System.out.println("\n--- Checking Out ---");
        user1.checkout();


        System.out.println("\n--- User's Purchased Items ---");
        for (Media m : user1.getPurchasedMediaList()) {
            System.out.println("- " + m.getTitel());
        }



        System.out.println("\n--- Remaining Stock for 'Java Programming' ---");
        System.out.println("Stock: " + book1.getStock());


        System.out.println("\n--- Adding a Review ---");
        Review review1 = new Review("Walaa", 5, "Amazing Java resource!");
        book1.addReview(review1);
        System.out.println("Average Rating: " + book1.getAverageRating());
        System.out.println("Is Bestseller? " + book1.isBestSaller());
        System.out.println("Media Type: " + book1.getMediaType());

    }




}
