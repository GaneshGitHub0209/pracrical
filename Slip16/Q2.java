package Slip16;

abstract class Shape {
    abstract double calculateArea();
    abstract double calculateVolume();
}

class Sphere extends Shape {
    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }

    @Override
    double calculateVolume() {
        return (4 / 3.0) * Math.PI * Math.pow(radius, 3);
    }
}

class Cone extends Shape {
    private double radius;
    private double height;

    public Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    double calculateArea() {
        double slantHeight = Math.sqrt(Math.pow(radius, 2) + Math.pow(height, 2));
        return Math.PI * radius * (radius + slantHeight);
    }

    @Override
    double calculateVolume() {
        return (1 / 3.0) * Math.PI * Math.pow(radius, 2) * height;
    }
}

class Cylinder extends Shape {
    private double radius;
    private double height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    double calculateArea() {
        return 2 * Math.PI * radius * (radius + height);
    }

    @Override
    double calculateVolume() {
        return Math.PI * Math.pow(radius, 2) * height;
    }
}

public class Q2 {
    public static void main(String[] args) {
        Sphere sphere = new Sphere(5);
        System.out.println("Sphere Area: " + sphere.calculateArea());
        System.out.println("Sphere Volume: " + sphere.calculateVolume());

        Cone cone = new Cone(3, 7);
        System.out.println("Cone Area: " + cone.calculateArea());
        System.out.println("Cone Volume: " + cone.calculateVolume());

        Cylinder cylinder = new Cylinder(4, 6);
        System.out.println("Cylinder Area: " + cylinder.calculateArea());
        System.out.println("Cylinder Volume: " + cylinder.calculateVolume());
    }
}