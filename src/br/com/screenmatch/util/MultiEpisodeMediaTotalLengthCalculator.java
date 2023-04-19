package br.com.screenmatch.util;

public class MultiEpisodeMediaTotalLengthCalculator {
    
    // private constructor to prevent instantiation
    private MultiEpisodeMediaTotalLengthCalculator() {
    }

    public static String calculate(int episodes, String episodeLength) {
        int totalMinutes = episodes * Integer.parseInt(episodeLength.split(" ")[0]);
        int hours = totalMinutes / 60;
        int minutes = totalMinutes % 60;
        String result = "";

        if (hours > 0) {
            result += hours + " hour";
            if (hours > 1) {
                result += "s";
            }
            result += " ";
        }

        if (minutes > 0) {
            result += minutes + " minute";
            if (minutes > 1) {
                result += "s";
            }
        }

        return result.trim();
    }
}
