class CircleArea {
    static final double PI = 3.14159;   // constant
    static double area(double r) {      // static method
        return PI * r * r;
    }
}
public class CircleArea {
    public static void main(String[] args) {
        double a = Circle.area(5);      // no object needed
        System.out.println("PI = " + Circle.PI);
        System.out.println("Area = " + a);
    }
}

