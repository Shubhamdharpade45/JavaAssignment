package PraciceSession24jul;

public class Area {

	// for circle
	void calculateArea(double r) {
		double areaOfCircle = 3.14 * (r * r);
		System.out.println("Area of circle is : " + areaOfCircle);
	}

	// for Rectangle
	void calculateArea(double length, double width) {

		double areaOfRectangle = length * width;

		System.out.println("Area of Rectangle is : " + areaOfRectangle);

	}

	// for Triangle
	void calculateArea(double width, int height) {
		double areaOfTriangle = 0.5 * width * height;
		System.out.println("Area Of Triangle is: " + areaOfTriangle);
	}
}
