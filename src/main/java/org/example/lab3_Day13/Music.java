package org.example.lab3_Day13;
import java.util.List;
import java.util.ArrayList;

public class Music extends Media {
    private String artist;


    public Music(String titel, String autheur, String ISBN, double price, String artist) {
        super(titel, autheur, ISBN, price);
        this.artist = artist;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }


    // method 1

    public void listen(User user) {
        user.addToPurchasedMedia(this);
        System.out.println("Now listening to: " + getTitel() + " by " + artist);
    }


    // method 2
    public List<Music> generatePlaylist(List<Music> musicCatalog) {
        List<Music> playlist = new ArrayList<>();
        for (Music m : musicCatalog) {
            if (m.getArtist().equals(this.artist) && !m.getTitel().equals(this.getTitel())) {
                playlist.add(m);
            }
        }
        return playlist;
    }

    // Override

    public String getMediaType() {
        if (getPrice() >= 10) {
            return "Premium Music";
        } else {
            return "Music";
        }
    }

    @Override
    public String toString() {
        return super.toString() + " [Artist: " + artist + ", Type: " + getMediaType() + "]";
    }






}
