package com.kodilla.spring.intro.shape;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DrawerTestSuite {

    @Test
    void testDoDrawingWithSquare() {
        //Given
        Shape square = new Square();

        //When
        Drawer drawer = new Drawer(square);
        String result = drawer.doDrawing();

        //Then
        assertEquals(result, "This is a square.");
    }

    @Test
    void testDoDrawingWithTriangle() {
        //Given
        Shape triangle = new Triangle();

        //When
        Drawer drawer = new Drawer(triangle);
        String result = drawer.doDrawing();

        //Then
        assertEquals("This is a triangle.", result);
    }
}
