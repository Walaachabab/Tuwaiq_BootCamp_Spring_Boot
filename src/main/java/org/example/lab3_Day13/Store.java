package org.example.lab3_Day13;
import java.util.ArrayList;
public class Store {
    private ArrayList<User> users;
    private ArrayList<Media> medias;

//
//    public Store(ArrayList<User> users, ArrayList<Media> medias) {
//        this.users = new ArrayList<>();
//        this.medias = new ArrayList<>();;
//    }


    public Store() {
        this.users = new ArrayList<>();
        this.medias = new ArrayList<>();
    }

    public ArrayList<Media> getMedias() {
        return medias;
    }

    public void setMedias(ArrayList<Media> medias) {
        this.medias = medias;
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }

    // method 1
    public void addUser(User user) {
        users.add(user);
    }


    // method 2
    public void displayUsers() {
        System.out.println("Registered Users:");
        for (User u : users) {
            System.out.println(u.toString());
        }
    }


    // method 3
    public void addMedia(Media media) {
        medias.add(media);
    }

    // method 4
    public void displayMedias() {
        System.out.println("Available Medias in Store:");
        for (Media m : medias) {
            System.out.println(m.toString());
        }
    }

    // method 5

    public Book searchBook(String title) {
        for (Media m : medias) {
            if (m instanceof Book) {
                if (m.getTitel().equalsIgnoreCase(title)) {
                    return (Book) m;
                }
            }
        }
        System.out.println("Book not found!");
        return null;
    }






}