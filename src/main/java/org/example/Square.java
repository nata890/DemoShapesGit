package org.example;

public class Square extends Shape{

    private double width = 0;
    private double area = 0;
    private double perimetro = 0;

    public void setWidth(double newWidth) {
        if(newWidth >= 0){
            width = newWidth;
        }
    }

    public double getWidth() {
        return width;
    }

    public void setHeight(double newHeight) {

        setWidth(newHeight);
    }

    public double getHeight() {

        return getWidth();
    }

    public double getArea() {

        return getWidth() * getHeight();
    }

    public double getPerimetro() {

        return 2 * getWidth() + 2 * getHeight();
    }

}
