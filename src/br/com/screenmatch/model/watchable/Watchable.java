package br.com.screenmatch.model.watchable;

import br.com.screenmatch.model.Media;

public class Watchable implements Media{
    
    // Object attributes
    private String name;
    private String genre;
    private String length;
    private int year;
    private boolean watched = false;

    // Class internal attributes
    private int ratingsSum;
    private int ratingsCount;

    public Watchable(String name, String genre, String length, int year) {
        this.name = name;
        this.genre = genre;
        this.length = length;
        this.year = year;
    }

    public String name() {
        return name;
    }

    public String genre() {
        return genre;
    }

    public String length() {
        return length;
    }

    public String rating() {
        int count = ratingsSum == 0 ? 0 : ratingsSum / ratingsCount;
        StringBuilder stars = new StringBuilder();
        for (int i = 0; i < count; i++) {
            stars.append("*");
        }
        return stars.toString();
    }

    public int year() {
        return year;
    }

    public int ratingsCount() {
        return ratingsCount;
    }

    public void rate(int rating) {
        if (rating < 1 || rating > 5) {
            throw new IllegalArgumentException("Rating must be between 1 and 5");
        }
        ratingsSum += rating;
        ratingsCount++;
    }

    public String info() {
        return "Media: " + name + "\n" +
                "Genre: " + genre + "\n" +
                "Length: " + length + "\n" +
                "Year: " + year + "\n" +
                "Rating: " + rating() + "\n" +
                "Votes: " + ratingsCount + "\n";
    }

    public void printInfo() {
        System.out.println(info());
    }

    public boolean isWatched() {
        return watched;
    }

    public void watch(boolean watched) {
        this.watched = watched;
    }
}
