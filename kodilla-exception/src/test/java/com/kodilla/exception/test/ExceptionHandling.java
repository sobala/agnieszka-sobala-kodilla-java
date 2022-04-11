package com.kodilla.exception.test;

public class ExceptionHandling {

    public static void main(String[] args) {
        SecondChallenge sc = new SecondChallenge();
        try {
            String returnedValue = sc.probablyIWillThrowException(4.5, 5.5);
        } catch (Exception e) {
            System.out.println("Exception was thrown.");
        } finally {
            System.out.println("Finished");
        }
    }
}
