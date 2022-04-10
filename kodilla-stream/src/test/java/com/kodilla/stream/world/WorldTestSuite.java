package com.kodilla.stream.world;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WorldTestSuite {

    @Test
    void testGetPeopleQuantity() {
        //Given
        Country chad = new Country("Chad", new BigDecimal("234034944"));
        Country nigeria = new Country("Nigeria", new BigDecimal("234944"));
        Country morocco = new Country("Morocco", new BigDecimal("21039443"));
        Country ireland = new Country("Ireland", new BigDecimal("23677443"));
        Country slovakia = new Country("Slovakia", new BigDecimal("11139443"));
        Country austria = new Country("Austria", new BigDecimal("3459443"));
        Country russia = new Country("Russia", new BigDecimal("2938754"));
        Country china = new Country("China", new BigDecimal("22294857"));
        Country vietnam = new Country("Vietnam", new BigDecimal("45555566"));
        List<Country> listOfCountries1 = new ArrayList<>();
        listOfCountries1.add(chad);
        listOfCountries1.add(nigeria);
        listOfCountries1.add(morocco);
        List<Country> listOfCountries2 = new ArrayList<>();
        listOfCountries2.add(ireland);
        listOfCountries2.add(slovakia);
        listOfCountries2.add(austria);
        List<Country> listOfCountries3 = new ArrayList<>();
        listOfCountries3.add(russia);
        listOfCountries3.add(china);
        listOfCountries3.add(vietnam);
        Continent africa = new Continent("Africa", listOfCountries1);
        Continent europe = new Continent("Europe", listOfCountries2);
        Continent asia = new Continent("Asia", listOfCountries3);
        List<Continent> listOfContinents = new ArrayList<>();
        listOfContinents.add(africa);
        listOfContinents.add(europe);
        listOfContinents.add(asia);
        World theWorld = new World(listOfContinents);

        //When
        BigDecimal theQuantity = theWorld.getContinents().stream()
                .flatMap(continent -> continent.getCountries().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));

        //Then
        assertEquals(theQuantity, new BigDecimal("364374837"));
    }
}
