package org.example;

import java.util.ArrayList;

public class Shapes {
    private double area = 0;
    private ArrayList<Shape> listShapes = new ArrayList<>();

    public void addShape(Shape shape) {
        listShapes.add(shape);
    }

    public Shape getShape(int index) {
        return listShapes.get(index);
    }

    public double getArea() {
        for(Shape s : listShapes)
            area += s.getArea();
        return area;
    }
}
