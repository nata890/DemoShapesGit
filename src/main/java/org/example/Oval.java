package org.example;

public class Oval extends Circle {
    private int radius2;
    public void setRadius2(int r) {
        if(r > 0) {
            radius2 = r;
        }
    }
    public int getRadius2() {
        return radius2;
    }
    @Override
    public double getArea() {
        int d = getRadius() * radius2;

        return d*Math.PI;
    }
    public double getPerimetro() {
        return Math.PI * (getRadius() + radius2);
    }
}