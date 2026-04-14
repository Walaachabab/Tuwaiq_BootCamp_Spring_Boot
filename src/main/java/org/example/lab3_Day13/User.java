package org.example.lab3_Day13;
import java.util.ArrayList;
public class User {

    private String username;
    private String email;
    private ArrayList<Media> purchasedMediaList;
    private ArrayList<Media> shoppingCart;

    public User(String username, String email) {
        this.username = username;
        this.email = email;
        this.purchasedMediaList = new ArrayList<>();
        this.shoppingCart = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<Media> getPurchasedMediaList() {
        return purchasedMediaList;
    }

    public void setPurchasedMediaList(ArrayList<Media> purchasedMediaList) {
        this.purchasedMediaList = purchasedMediaList;
    }

    public ArrayList<Media> getShoppingCart() {
        return shoppingCart;
    }

    public void setShoppingCart(ArrayList<Media> shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    // method 1

    public void addToCart(Media media){
        shoppingCart.add(media);
        System.out.println(media.getTitel() + " added to cart.");
    }

     // method 2

    public void removeFromCart(Media media) {
        shoppingCart.remove(media);
        System.out.println(media.getTitel() + " removed from cart.");
    }

    // method 3

    public void checkout() {
        if (shoppingCart.isEmpty()) {
            System.out.println("Cart is empty!");
            return;
        }

        for (Media m : shoppingCart) {
            if (m instanceof Book) {
                ((Book) m).purchase(this);
            } else {
                purchasedMediaList.add(m);
            }
        }
        shoppingCart.clear();
        System.out.println("Checkout complete for " + username);
    }



    public void addToPurchasedMedia(Media media) {
        purchasedMediaList.add(media);
    }


    @Override
    public String toString() {
        return "User: " + username + " (" + email + ")";
    }





}
