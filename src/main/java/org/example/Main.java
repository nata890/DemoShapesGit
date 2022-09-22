package org.example;
public class Main {
    public static void main(String[] args) {

        Square rect =  new Rect();
        rect.setWidth(18);
        rect.setHeight(12);
        System.out.printf("\nPerimetro rectangulo: %.2f", rect.getPerimetro());
        System.out.printf("\nArea rectangulo: %.2f\n", rect.getArea());

        Circle circle = new Circle();
        circle.setRadius(5);
        System.out.printf("\nArea circulo: %.2f", circle.getArea());
        System.out.printf("\nPerimetro circulo: %.2f\n", circle.getPerimetro());

        Square square = new Square();
        square.setWidth(7);
        System.out.printf("\nArea cuadrado: %.2f", square.getArea());
        System.out.printf("\nPerimetro cuadrado: %.2f\n", square.getPerimetro());

        Oval oval = new Oval();
        oval.setRadius(3);
        oval.setRadius2(2);
        System.out.printf("\nArea ovalo: %.2f", oval.getArea());
        System.out.printf("\nPerimetro ovalo: %.2f\n", oval.getPerimetro());

        RightTriangle rightTriangle = new RightTriangle();
        rightTriangle.setWidth(3);
        rightTriangle.setHeight(4);
        System.out.printf("\nPerimetro triangulo rectangulo: %.2f", rightTriangle.getPerimetro());
        System.out.printf("\nArea triangulo rectangulo: %.2f\n", rightTriangle.getArea());

        IsoscelesTriangle isoscelesTriangle = new IsoscelesTriangle();
        isoscelesTriangle.setWidth(12);
        isoscelesTriangle.setHeight(16);
        System.out.printf("\nPerimetro isoceles: %.2f", isoscelesTriangle.getPerimetro());//44
        System.out.printf("\nArea isoceles: %.2f\n", isoscelesTriangle.getArea());//96

        Shapes shapesList = new Shapes();
        shapesList.addShape(circle);
        shapesList.addShape(oval);
        shapesList.addShape(square);
        shapesList.addShape(rect);
        shapesList.addShape(isoscelesTriangle);
        shapesList.addShape(rightTriangle);

        System.out.printf("\nLa suma de las areas es: %.2f\n", shapesList.getArea());
    }
}