package com.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTestSuite {

    @Test
    void testDefaultSharingStrategies() {
        //Given
        User john = new Millenials("John Smith");
        User samantha = new YGeneration("Samantha Son");
        User martin = new ZGeneration("Martin King");

        //Then
        assertEquals("Sharing on Facebook.", john.share());
        assertEquals("Sharing on Twitter.", samantha.share());
        assertEquals("Sharing on Snapchat.", martin.share());

    }

    @Test
    void testIndividualSharingStrategies() {
        //Given
        User john = new Millenials("John Smith");

        //When
        john.setSocialPublisher(new TwitterPublisher());

        //Then
        assertEquals("Sharing on Twitter.", john.share());

    }
}
