package org.example;

public class Rect extends Square{

    private double height = 0;

    @Override
    public double getHeight() {
        return height;
    }

    @Override
    public void setHeight(double newHeight) {
        if(newHeight >= 0){
            height = newHeight;
        }
    }
}
