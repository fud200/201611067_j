package com.sd.homework;
import com.sd.homework.*;
public class ShapeMain{
	public static void main(String[] args){
		Rectangle r = new Rectangle(7.0,8.0);
		Circle c = new Circle(7.0);
		Shape[] s = {r,c};
		for(Shape e:s){
			double area = e.calcArea();
			double perimeter = e.calcPerimeter();
			System.out.println("Area: "+area);
			System.out.println("Perimeter: "+perimeter);
		}
	}
}