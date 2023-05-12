package Slip19;
class AreaCalculator {
    public double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    public double calculateArea1(double base, double height) {
        return 0.5 * base * height;
    }

    public double calculateArea(double length, double width) {
        return length * width;
    }
}

public class Q2 {
    public static void main(String[] args) {
        double circleRadius = 5.0;
        double triangleBase = 4.0;
        double triangleHeight = 3.0;
        double rectangleLength = 6.0;
        double rectangleWidth = 4.0;

        AreaCalculator calculator = new AreaCalculator();

        double circleArea = calculator.calculateArea(circleRadius);
        System.out.println("Area of Circle with radius " + circleRadius + ": " + circleArea);

        double triangleArea = calculator.calculateArea1(triangleBase, triangleHeight);
        System.out.println("Area of Triangle with base " + triangleBase + " and height " + triangleHeight + ": " + triangleArea);

        double rectangleArea = calculator.calculateArea1(rectangleLength, rectangleWidth);
        System.out.println("Area of Rectangle with length " + rectangleLength + " and width " + rectangleWidth + ": " + rectangleArea);
    }
}