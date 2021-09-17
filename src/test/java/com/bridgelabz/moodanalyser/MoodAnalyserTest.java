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
        moodanalyser.setMessage("I am in Sad Mood");
        try {
            String actualResult = moodanalyser.analyseMood();
            Assert.assertEquals("Sad", actualResult);
        } catch (MoodAnalysisException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenMessage_WhenProper_ShouldReturnHappy() throws MoodAnalysisException {
        MoodAnalyser moodanalyser = new MoodAnalyser();
        moodanalyser.setMessage("I am in happy Mood");
        try {
            String actualResult = moodanalyser.analyseMood();
            Assert.assertEquals("Happy", actualResult);
        } catch (MoodAnalysisException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenMessage_Null_ShouldReturnMessage() throws MoodAnalysisException {
        MoodAnalyser moodanalyser = new MoodAnalyser();
        moodanalyser.setMessage(null);
        try {
            String actualResult = moodanalyser.analyseMood();
            Assert.assertEquals("Null Mood ", actualResult);
        } catch (MoodAnalysisException e) {
            e.printStackTrace();
        }
    }
}
