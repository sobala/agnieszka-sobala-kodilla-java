package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;


@DisplayName("Collection Test Suite")
public class CollectionTestSuite {

    OddNumbersExterminator exterminator = new OddNumbersExterminator();

    @BeforeEach
    public void before() {
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test Case: end");
    }

    @DisplayName(
            "When a list is empty it should return empty list."
    )
    @Test
    void testOddNumbersExterminatorEmptyList() {
        //Given
        List<Integer> listOfNumbers = new LinkedList<>();
        //When
        List<Integer> modifiedList = exterminator.exterminate(listOfNumbers);
        //Then
        Assertions.assertTrue(modifiedList.isEmpty());
    }

    @DisplayName(
            "When a list includes both odd and even numbers " +
                    "return a list with only even ones."
    )
    @Test
    void testOddNumbersExterminatorNormalList() {
        //Given
        List<Integer> listOfNumbers = new ArrayList<>();
        listOfNumbers.add(45);
        listOfNumbers.add(-4);
        listOfNumbers.add(2);
        listOfNumbers.add(-3);
        listOfNumbers.add(0);
        //When
        List<Integer> modifiedList = exterminator.exterminate(listOfNumbers);
        List<Integer> options = Arrays.asList(0, 2, 4, 6, 8);
        //Then
        int lastDigit;
        for (Integer number : modifiedList) {
            if (number == 0) {
                lastDigit = 0;
            } else {
                lastDigit = Math.abs(number) % 10;
            }
            Assertions.assertTrue(options.contains(lastDigit));
        }
    }
}
