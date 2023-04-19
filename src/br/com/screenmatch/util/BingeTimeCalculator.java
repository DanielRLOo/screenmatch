package br.com.screenmatch.util;

import br.com.screenmatch.model.watchable.Watchable;

public class BingeTimeCalculator {
    private static int totalMinutes = 0;
    private static int totalHours = 0;
    private static int totalDays = 0;
    private static int totalWeeks = 0;
    private static int totalMonths = 0;
    private static int totalYears = 0;
    private static String result = "";

    //private constructor to prevent instantiation
    private BingeTimeCalculator() {
    }

    public static String calculate(Watchable[] watchables) {
        extractRunTime(watchables);
        calculateRunTime();
        buildResult();
        return result;
    }

    private static void extractRunTime(Watchable[] watchables) {
        for (Watchable watchable : watchables) {
            String[] lengthParts = watchable.length().split(" ");
            for (int i = 0; i < lengthParts.length; i++) {
                if (lengthParts[i].contains("hour")) {
                    totalHours += Integer.parseInt(lengthParts[i - 1]);
                } else if (lengthParts[i].contains("minute")) {
                    totalMinutes += Integer.parseInt(lengthParts[i - 1]);
                }
            }
        }
    }

    private static void calculateRunTime() {
        if (totalMinutes >= 60) {
            totalHours += totalMinutes / 60;
            totalMinutes = totalMinutes % 60;
        }
        if (totalHours >= 24) {
            totalDays += totalHours / 24;
            totalHours = totalHours % 24;
        }
        if (totalDays >= 7) {
            totalWeeks += totalDays / 7;
            totalDays = totalDays % 7;
        }
        if (totalWeeks >= 4) {
            totalMonths += totalWeeks / 4;
            totalWeeks = totalWeeks % 4;
        }
        if (totalMonths >= 12) {
            totalYears += totalMonths / 12;
            totalMonths = totalMonths % 12;
        }
    }

    private static void buildResult() {
        if (totalYears > 0) {
            result += totalYears + " year";
            if (totalYears > 1) {
                result += "s";
            }
            result += ", ";
        }
        if (totalMonths > 0) {
            result += totalMonths + " month";
            if (totalMonths > 1) {
                result += "s";
            }
            result += ", ";
        }
        if (totalWeeks > 0) {
            result += totalWeeks + " week";
            if (totalWeeks > 1) {
                result += "s";
            }
            result += ", ";
        }
        if (totalDays > 0) {
            result += totalDays + " day";
            if (totalDays > 1) {
                result += "s";
            }
            result += ", ";
        }
        if (totalHours > 0) {
            result += totalHours + " hour";
            if (totalHours > 1) {
                result += "s";
            }
            result += ", ";
        }
        if (totalMinutes > 0) {
            result += totalMinutes + " minute";
            if (totalMinutes > 1) {
                result += "s";
            }
        }
    }
}
