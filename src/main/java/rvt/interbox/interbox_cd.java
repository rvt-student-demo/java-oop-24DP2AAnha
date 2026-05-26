package rvt.interbox;

public class interbox_cd implements interbox_packable {
    
    private String artist;
    private String name;
    private int pub_year;
    private double weight;

    public interbox_cd (String artist, String name, int year) {

        this.artist = artist;
        this.name = name;
        this.pub_year = year;
        this.weight = 0.1;

    }

    public double weight() {

        return this.weight;

    }

    public String toString() {

        return artist + ": " + name + " (" + pub_year +")";

    }
}
