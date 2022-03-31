package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {

    List<Shape> listOfShapes = new ArrayList<>();

    public void addFigure(Shape s) {
        listOfShapes.add(s);
    }

    public boolean removeFigure(Shape s) {
        if (listOfShapes.contains(s)) {
            listOfShapes.remove(s);
            return true;
        } else {
            return false;
        }
    }

    public Shape getFigure(int n) {
        return listOfShapes.get(n);
    }

    public String showFigures() {
        String names = "";
        for (Shape s : listOfShapes) {
            names += s.getShapeName() + " ";
        }
        return names;
    }
}
