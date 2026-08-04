package com.Interface;

public class Shape implements Circle, Rectangle {

	@Override
	public void calculateAreaOfCircle(double radious) {

		double pie = 3.14;

		double area = pie * (radious * radious);

		System.out.println("Area of circle is " + area);

	}

	@Override
	public void calculateAreaOfRectangle(double length, double width) {

		double area = length * width;
		System.out.println("Area of the Rectangle is " + area);

	}

}
