package com.bridgelabz.moodanalyser;

/**
 * Hello world!
 */
public class MoodAnalyser {

    public static String analyseMood(String message) throws MoodAnalysisException {
        try {
            if (message.length() == 0) {
                throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.EMPTY, "Empty mood");
            }
            if (message.toLowerCase().contains("sad")) {
                return "sad";
            } else {
                return "happy";
            }
        } catch (NullPointerException exception) {
            throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.NULL, "Invalid mood");
        }
    }
}