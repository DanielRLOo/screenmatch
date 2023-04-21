package br.com.screenmatch;

import java.util.Random;

import br.com.screenmatch.model.Media;
import br.com.screenmatch.model.watchable.movie.Movie;
import br.com.screenmatch.model.watchable.multiepisode.anime.Anime;
import br.com.screenmatch.model.watchable.multiepisode.cartoon.Cartoon;
import br.com.screenmatch.model.watchable.multiepisode.series.Series;
import br.com.screenmatch.util.BingeTimeCalculator;

public class Main {

    public static void main(String[] args) {
        
        // Media genres
        final String GENRE_ADVENTURE = "Adventure";
        final String GENRE_COMEDY = "Comedy";
        final String GENRE_DRAMA = "Drama";

        // Random number generator
        Random random = new Random();

        //Clearing the terminal
        System.out.print("\033[H\033[2J");
        
        // Creating a movie and rating it
        Movie movie = new Movie("The Lord of the Rings", GENRE_ADVENTURE, "2 hours 58 minutes", 2001);
        for (int i = 0; i < random.nextInt(2000); i++) {
            movie.rate(random.nextInt(5) + 1);
        }

        // Print movie info to terminal
        movie.printInfo();
        
        //Creating another movie and rating it
        Movie movie2 = new Movie("Pirates of the Caribbean", GENRE_ADVENTURE, "2 hours 23 minutes", 2003);
        for (int i = 0; i < random.nextInt(2000); i++) {
            movie2.rate(random.nextInt(5) + 1);
        }

        // Print movie info to terminal
        movie2.printInfo();

        // Creating a series and rating it
        Series series = new Series("The Office", GENRE_COMEDY, "30 minutes", 2005, 9, 201, true);
        for (int i = 0; i < random.nextInt(2000); i++) {
            series.rate(random.nextInt(5) + 1);
        }

        // Print series info to terminal
        series.printInfo();
        
        // Creating another series and rating it
        Series series2 = new Series("Breaking Bad", GENRE_DRAMA, "50 minutes", 2008, 5, 62, false);
        for (int i = 0; i < random.nextInt(2000); i++) {
            series2.rate(random.nextInt(5) + 1);
        }

        // Print series info to terminal
        series2.printInfo();
        
        // Creating a anime and rating it
        Anime anime = new Anime("One Piece", GENRE_ADVENTURE, "35 minutes", 1999, 20, 1000, true);
        for (int i = 0; i < random.nextInt(2000); i++) {
            anime.rate(random.nextInt(5) + 1);
        }

        // Print anime info to terminal
        anime.printInfo();

        // Creating a cartoon and rating it
        Cartoon cartoon = new Cartoon("Rick and Morty", GENRE_COMEDY, "29 minutes", 2013, 4, 70, true);
        for (int i = 0; i < random.nextInt(2000); i++) {
            cartoon.rate(random.nextInt(5) + 1);
        }

        // Print cartoon info to terminal
        cartoon.printInfo();

        // Calculating total watch time of all watchables and printing it to terminal
        Media[] media = {movie, series, movie2, series2, anime, cartoon};
        System.out.println("Total watch time is " + BingeTimeCalculator.calculate(media));
    }
}