package org.example;

public class Circle extends Shape{
    private int radius;

    public void setRadius(int r) {
        if(r > 0) {
            radius = r;
        }
    }

    public int getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.PI * (radius*radius);
    }

    public double getPerimeter() {
        return (Math.PI * 2 * radius);
    }
}
