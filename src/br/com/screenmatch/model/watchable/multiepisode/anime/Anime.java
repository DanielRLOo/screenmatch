package br.com.screenmatch.model.watchable.multiepisode.anime;

import br.com.screenmatch.model.watchable.multiepisode.MultiEpisodeMedia;

public class Anime extends MultiEpisodeMedia {
    // Constructor
    public Anime(String name, String genre, String length, int year, int seasons, int episodes, boolean isFinished) {
        super(name, genre, length, year, seasons, episodes, isFinished);
    }

    @Override
    public String info() {
        return "Anime: " + name() + "\n" +
                "Genre: " + genre() + "\n" +
                "Length: " + length() + "\n" +
                "Year: " + year() + "\n" +
                "Rating: " + rating() + "\n" +
                "Votes: " + ratingsCount() + "\n" +
                "Seasons: " + seasons + "\n" +
                "Episodes: " + episodes + "\n" +
                "Finished: " + isFinished + "\n";
    }
}
