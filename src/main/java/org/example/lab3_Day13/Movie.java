package org.example.lab3_Day13;
import java.util.List;
import java.util.ArrayList;

public class Movie extends Media {

private int duration;


    public Movie(String title, String auteur, String ISBN, double price, int duration) {
        super(title, auteur, ISBN, price);
        this.duration = duration;
    }


    public int getDuration() {
        return duration;
    }


    public void setDuration(int duration) {
        this.duration = duration;
    }

// method 1
    public void watch(User user) {
        user.addToPurchasedMedia(this);
        System.out.println("Now watching: " + getTitel());
    }

// method 2

    public List<Movie> recommendSimilarMovies(List<Movie> movieCatalog) {
        List<Movie> recommendations = new ArrayList<>();
        for (Movie m : movieCatalog) {
            if (m.getAutheur().equals(this.getAutheur()) && !m.getTitel().equals(this.getTitel())) {
                recommendations.add(m);
            }
        }
        return recommendations;
    }

    public String getMediaType() {
        if (duration >= 120) {
            return "Long Movie";
        } else {
            return "Movie";
        }
    }

    @Override
    public String toString() {
        return super.toString() + " [Duration=" + duration + " mins, Type=" + getMediaType() + "]";
    }




}
