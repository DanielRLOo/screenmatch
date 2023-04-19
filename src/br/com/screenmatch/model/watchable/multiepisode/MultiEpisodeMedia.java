package br.com.screenmatch.model.watchable.multiepisode;

import br.com.screenmatch.model.watchable.Watchable;
import br.com.screenmatch.util.MultiEpisodeMediaTotalLengthCalculator;

public class MultiEpisodeMedia extends Watchable{
    // Object attributes
    protected int seasons;
    protected int episodes;
    protected boolean isFinished;

    public MultiEpisodeMedia(String name, String genre, String length, int year, int seasons, int episodes, boolean isFinished) {
        super(name, genre, length, year);
        this.seasons = seasons;
        this.episodes = episodes;
        this.isFinished = isFinished;
    }

    public int seasons() {
        return seasons;
    }

    public int episodes() {
        return episodes;
    }

    public boolean isFinished() {
        return isFinished;
    }

    public String episodeLength() {
        return super.length();
    }

    @Override
    public String length() {
        return MultiEpisodeMediaTotalLengthCalculator.calculate(episodes, episodeLength());
    }
}
