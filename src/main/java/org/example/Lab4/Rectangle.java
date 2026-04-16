package org.example.Lab4;

public class Rectangle extends Shape{

    private double height;
    private double width;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }


    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double calculateCircumference() {
        return 2 * (height + width);
    }

    @Override
    public double calculateArea() {
        return height * width;
    }


    public String toString(){

       return "Rectangle [ Height: " + height + ", Width: " + width + "]";

    }



}
