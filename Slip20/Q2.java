package Slip20;

class TypeConversionDemo {
    public void showInfo(int num) {
        System.out.println("Integer number: " + num);
    }

    public void showInfo(double num) {
        System.out.println("Double number: " + num);
    }

    public void showInfo(String text) {
        System.out.println("String: " + text);
    }
}

public class Q2 {
    public static void main(String[] args) {
        TypeConversionDemo demo = new TypeConversionDemo();

        int intValue = 42;
        demo.showInfo(intValue);

        double doubleValue = 3.14;
        demo.showInfo(doubleValue);

        String stringValue = "Hello!";
        demo.showInfo(stringValue);

        byte byteValue = 10;
        demo.showInfo(byteValue);

        short shortValue = 20;
        demo.showInfo(shortValue);
    }
}