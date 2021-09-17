package com.bridgelabz.moodanalyser;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class MoodAnalyserTest {
    @Test
    public void givenMessage_WhenProper_ShouldReturnSad() {
        MoodAnalyser moodanalyser = new MoodAnalyser();
        String actualResult = moodanalyser.analyseMood("I am in Sad Mood");
        Assert.assertEquals("Sad", actualResult);
    }

    @Test
    public void givenMessage_ContainsAny_init_ShouldReturnHappy() {
        MoodAnalyser moodanalyser = new MoodAnalyser();
        String actualResult = moodanalyser.analyseMood("I am in Any Mood");
        Assert.assertEquals("Happy", actualResult);
    }
}
