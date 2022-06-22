package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaskFactoryTestSuite {

    @Test
    void testFactoryShoppingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();

        //When
        Task shoppingTask1 = taskFactory.makeTask("SHOPPING");
        Task paintingTask1 = taskFactory.makeTask("PAINTING");
        Task drivingTask1 = taskFactory.makeTask("DRIVING");

        //Then
        assertEquals("Buy alcohol.", shoppingTask1.getTaskName());
    }

    @Test
    void testFactoryPaintingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();

        //When
        Task paintingTask1 = taskFactory.makeTask("PAINTING");

        //Then
        assertEquals("Paint a room.", paintingTask1.getTaskName());
    }

    @Test
    void testFactoryDrivingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();

        //When
        Task drivingTask1 = taskFactory.makeTask("DRIVING");

        //Then
        assertEquals("Drive home.", drivingTask1.getTaskName());
    }
}
