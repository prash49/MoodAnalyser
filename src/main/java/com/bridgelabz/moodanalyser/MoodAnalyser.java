package com.bridgelabz.moodanalyser;

/**
 * Hello world!
 */
public class MoodAnalyser {
    public static String analyseMood(String message) {
        if (message.toLowerCase().contains("sad")) {
            return "Sad";
        } else if (message.toLowerCase().contains("Any")) {

        }
        return "Happy";
    }
}
