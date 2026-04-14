package org.example.lab3_Day13;

public class Review {
    private String username;
    private int rating;
    private String comment;


    public Review(String username, int rating, String comment) {
       this.username = username;
        this.rating = rating;
        this.comment = comment;
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        username = username;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }


  public String toString(){
     return "Review by " + username + ": " + rating + "/ " + comment;
  }



}
