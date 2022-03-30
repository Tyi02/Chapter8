package com.CSCI185;

public class MeasurableDemo {
    public static void main(String[] args)
    {
        Rectangle r1 = new Rectangle(10,5);
        printMeasurableDetails(r1);
        Circle c1 = new Circle(5);
        printMeasurableDetails(c1);
    }
    public static void printMeasurableDetails(Measurable m)
    {

        System.out.println("Area: "+m.getArea());
        System.out.println("Perimeter: "+m.getPerimeter());
    }
}
