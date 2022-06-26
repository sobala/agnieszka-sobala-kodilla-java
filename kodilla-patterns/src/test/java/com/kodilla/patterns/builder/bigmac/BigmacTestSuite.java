package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BigmacTestSuite {

    @Test
    void testBigmacBuilder() {
        //Given
        Bigmac theBigmac = new Bigmac.BigmacBuilder()
                .bun("regular")
                .burgers(2)
                .sauce("barbecue")
                .ingredient("onions")
                .ingredient("cheese")
                .ingredient("beacon")
                .build();
        System.out.println(theBigmac);
        //When
        String bun = theBigmac.getBun();
        int burgers = theBigmac.getBurgers();
        String sauce = theBigmac.getSauce();
        List<String> ingredients = theBigmac.getIngredients();
        //Then
        assertEquals("regular", bun);
        assertEquals(2, burgers);
        assertEquals("barbecue", sauce);
        assertEquals(new ArrayList<>(Arrays.asList("onions", "cheese", "beacon")), ingredients);
    }

}
