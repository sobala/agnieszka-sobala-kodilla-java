package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.collection.OddNumbersExterminator;
import com.kodilla.testing.user.SimpleUser;

import java.util.LinkedList;
import java.util.List;

public class TestingMain {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        int result1 = calculator.add(4, 6);
        int result2 = calculator.subtract(66, 22);

        if (result1 == (4 + 6)) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        if (result2 == (66 - 22)) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }
    }
}
