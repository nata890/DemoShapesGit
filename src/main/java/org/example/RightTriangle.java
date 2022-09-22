package org.example;

public class RightTriangle extends Rect{

    private double hipotenusa = 0;

    public double getArea() {
        return (getWidth() * getHeight())/2;
    }

    public double getPerimetro() {
        hipotenusa = Math.sqrt((Math.pow(getWidth(), 2)) + (Math.pow(getHeight(), 2)));
        return getWidth() + getHeight() + hipotenusa;
    }


}
