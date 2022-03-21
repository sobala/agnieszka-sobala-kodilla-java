package com.kodilla.testing.collection;

import java.util.Iterator;
import java.util.List;

public class OddNumbersExterminator {

    public List<Integer> exterminate(List<Integer> numbers) {

        Iterator<Integer> iter = numbers.iterator();

        while (iter.hasNext()) {
            Integer number = iter.next();
            if (number != 0) {
                if ((Math.abs(number) % 2) != 0) {
                    iter.remove();
                }
            }
        }
        return numbers;
    }
}
