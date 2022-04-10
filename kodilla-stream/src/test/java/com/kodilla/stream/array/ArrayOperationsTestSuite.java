package com.kodilla.stream.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayOperationsTestSuite {

    @Test
    void testGetAverage() {
        //Given
        int numbers[] = {1, 5, 3, 0, -4, 3, 7, 9, 3, 2};
        //When
        double avg = ArrayOperations.getAverage(numbers);
        //Then
        assertEquals(avg, 2.9);

    }
}
