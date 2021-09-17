package com.bridgelabz.moodanalyser;

/**
 * Hello world!
 */
public class MoodAnalyser {
    public static String message;

    public MoodAnalyser() {
    }

    public MoodAnalyser(String message) {
        this.message = message;
        analyseMood();

    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public static String analyseMood() {
        try {
            if (message.toLowerCase().contains("sad")) {
                return "Sad";
            } else {
                return "Happy";
            }

        } catch (NullPointerException e) {
            return "Happy";
        }
    }
}
