package Slip18;

interface Shape {
    double area();
}

class Circle implements Shape {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

class Sphere implements Shape {
    private final double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return 4 * Math.PI * radius * radius;
    }
}

public class Q2 {
    public static void main(String[] args) {
        double circleRadius = 5.0;
        Circle circle = new Circle(circleRadius);
        double circleArea = circle.area();
        System.out.println("Area of Circle with radius " + circleRadius + ": " + circleArea);

        double sphereRadius = 3.0;
        Sphere sphere = new Sphere(sphereRadius);
        double sphereArea = sphere.area();
        System.out.println("Surface Area of Sphere with radius " + sphereRadius + ": " + sphereArea);
    }
}