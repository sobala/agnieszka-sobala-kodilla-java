package com.kodilla.testing.shape;

import org.junit.jupiter.api.*;

@DisplayName("TDD: ShapeCollector Test Suite")
public class ShapeCollectorTestSuite {

    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Nested
    @DisplayName("Tests for adding figures.")
    class TestAdd {

        @Test
        public void addFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape triangle1 = new Triangle();
            //When
            shapeCollector.addFigure(triangle1);
            //Then
            Assertions.assertTrue(shapeCollector.listOfShapes.contains(triangle1));
        }
    }

    @Nested
    @DisplayName("Tests for removing figures.")
    class TestRemove {

        @Test
        public void testRemoveFigureNotExisting() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape triangle1 = new Triangle();
            //When
            boolean isRemoved = shapeCollector.removeFigure(triangle1);
            //Then
            Assertions.assertFalse(isRemoved);
        }

        @Test
        public void testRemoveFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape triangle1 = new Triangle();
            Shape circle1 = new Circle();
            shapeCollector.addFigure(triangle1);
            shapeCollector.addFigure(circle1);
            //When
            boolean isRemoved = shapeCollector.removeFigure(triangle1);
            //Then
            Assertions.assertTrue(isRemoved);
        }
    }

    @Nested
    @DisplayName("Tests for getting figures.")
    class TestGet {

        @Test
        public void getFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape triangle1 = new Triangle();
            Shape circle1 = new Circle();
            shapeCollector.addFigure(triangle1);
            shapeCollector.addFigure(circle1);
            //When
            Shape theFigure = shapeCollector.getFigure(1);
            //Then
            Assertions.assertEquals(circle1, theFigure);
        }
    }

    @Nested
    @DisplayName("Tests for displaying names of figures.")
    class TestShow {

        @Test
        public void testShowFigures() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape triangle1 = new Triangle();
            Shape circle1 = new Circle();
            shapeCollector.addFigure(triangle1);
            shapeCollector.addFigure(circle1);
            //When
            String namesReturned = shapeCollector.showFigures();
            String names = "";
            for (Shape shape : shapeCollector.listOfShapes) {
                names += shape.getShapeName() + " ";
            }
            //Then
            Assertions.assertEquals(names, namesReturned);

        }
    }

}
