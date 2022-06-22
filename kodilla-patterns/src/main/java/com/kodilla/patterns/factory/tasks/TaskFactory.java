package com.kodilla.patterns.factory.tasks;

public class TaskFactory {

    public static final String SHOPPING = "SHOPPING";
    public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";

    public final Task makeTask(final String taskType) {
        switch (taskType) {
            case SHOPPING:
                return new ShoppingTask("Buy alcohol.", "beer, vodka", 5);
            case PAINTING:
                return new PaintingTask("Paint a room.", "blue", "walls");
            case DRIVING:
                return new DrivingTask("Drive home.", "home", "car");
            default:
                return null;
        }
    }
}
