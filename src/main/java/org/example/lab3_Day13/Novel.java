package org.example.lab3_Day13;
import java.util.ArrayList;

public class Novel extends Book {
    private String genre;

    public Novel(String titel, String autheur, String ISBN, double price, int stock,  String genre) {
        super(titel, autheur, ISBN, price, stock);
        this.genre = genre;
    }


    public String getGener() {
        return genre;
    }

    public void setGener(String genre) {
        this.genre = genre;
    }


    @Override
    public String getMediaType() {
        if (getAverageRating() >= 4.5) {
            return "Bestselling Novel";
        } else {
            return "Novel";
        }
    }


    @Override
    public String toString() {
        return super.toString() + " [Genre=" + genre + "]";
    }



}
