package org.example.lab3_Day13;

public class Media {
    private String titel;
    private String autheur;
    private String ISBN;
    private double price ;

//    public Media(){
//
//    }

    public Media(String titel, String autheur, String ISBN, double price) {
        this.titel = titel;
        this.autheur = autheur;
        this.ISBN = ISBN;
        this.price = price;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public String getAutheur() {
        return autheur;
    }

    public void setAutheur(String auteur) {
        this.autheur = autheur;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public String getMediaType(){
        return "Media";
    }


    public String toString(){
      return "Media [Titel: " + titel + "Autheur: " + autheur + ", ISBN: " + ISBN + "Price" + price + "]";
    }





}
