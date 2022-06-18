package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CalculatorTestSuite {

    @Autowired
    private Calculator calculator;

    @Test
    void testCalculations() {
        //Given
        double a = 10;
        double b = 2;
        //When
        double resultAdd = calculator.add(a, b);
        double resultSub = calculator.sub(a, b);
        double resultMul = calculator.mul(a, b);
        double resultDiv = calculator.div(a, b);
        //Then
        assertEquals(resultAdd, 12);
        assertEquals(resultSub, 8);
        assertEquals(resultMul, 20);
        assertEquals(resultDiv, 5);
    }
}
