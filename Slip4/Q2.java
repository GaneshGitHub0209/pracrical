package Slip4;

public class Q2 {
    // Calculate the area of a circle
    public static double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }
    
    // Calculate the area of a triangle
    public static double calculateArea1(double base, double height) {
        return 0.5 * base * height;
    }
    
    // Calculate the area of a rectangle
    public static double calculateArea(double length, double width) {
        return length * width;
    }
    
    public static void main(String[] args) {
        double circleRadius = 5.0;
        double triangleBase = 4.0;
        double triangleHeight = 3.0;
        double rectangleLength = 6.0;
        double rectangleWidth = 2.0;
        
        // Calculate and display the area of the circle
        double circleArea = calculateArea(circleRadius);
        System.out.println("Area of Circle: " + circleArea);
        
        // Calculate and display the area of the triangle
        double triangleArea = calculateArea1(triangleBase, triangleHeight);
        System.out.println("Area of Triangle: " + triangleArea);
        
        // Calculate and display the area of the rectangle
        double rectangleArea = calculateArea1(rectangleLength, rectangleWidth);
        System.out.println("Area of Rectangle: " + rectangleArea);
    }
}
