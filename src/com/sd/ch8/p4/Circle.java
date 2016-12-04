package com.sd.ch8.p4;
import com.sd.ch8_2.*;
public class Circle extends Shape {
    private final double radius, area, perimeter;

    public Circle(double radius) {
        this.radius = radius;
        this.area = Math.PI * radius * radius;
        this.perimeter = 2 * Math.PI * radius;
    }
    @Override
    public double calcArea() {
        return this.area;
    }
    @Override
    public double calcPerimeter() {
        return this.perimeter;
    }
    public String toString() {
        return "Circle..."+super.toString();
    }
    public static void main(String[] args){
        Circle c = new Circle(8);
        System.out.println("Area:"+c.calcArea());
        System.out.println("Perimeter:"+c.calcPerimeter());
    }
}