package com.kodilla.exception.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class SecondChallengeTestSuite {

    @Test
    void testProbablyIWillThrowException() {
        //Given
        SecondChallenge sc = new SecondChallenge();
        //When & Then
        assertAll(
            () -> assertThrows(Exception.class, () -> sc.probablyIWillThrowException(4.5, 7)),
            () -> assertThrows(Exception.class, () -> sc.probablyIWillThrowException(1, 1.5)),
            () -> assertThrows(Exception.class, () -> sc.probablyIWillThrowException(2, 1.5)),
            () -> assertDoesNotThrow(() -> sc.probablyIWillThrowException(1.5, 4))
        );
    }
}
