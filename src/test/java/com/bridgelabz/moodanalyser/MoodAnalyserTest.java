package com.bridgelabz.moodanalyser;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class MoodAnalyserTest {
    @Test
    public void givenMessage_WhenProper_ShouldReturnSad() throws MoodAnalysisException {
        MoodAnalyser moodanalyser = new MoodAnalyser();
        try {
            String actualResult = moodanalyser.analyseMood("I am in Sad Mood");
            Assert.assertEquals("sad", actualResult);
        } catch (MoodAnalysisException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenMessage_WhenProper_ShouldReturnHappy() throws MoodAnalysisException {
        MoodAnalyser moodanalyser = new MoodAnalyser();
        try {
            String actualResult = moodanalyser.analyseMood("I am in Any Mood");
            Assert.assertEquals("happy", actualResult);
        } catch (MoodAnalysisException e) {
            e.printStackTrace();
        }
    }


    @Test
    public void givenMessage_EmptyString_ShouldReturnMessage() {
        MoodAnalyser moodanalyser = new MoodAnalyser();
        try {
            String actualResult = moodanalyser.analyseMood(null);
            Assert.assertEquals("Empty mood", actualResult);
        } catch (MoodAnalysisException e) {
            e.printStackTrace();
            e.getMessage();
        }
    }
}
