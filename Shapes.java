package shapes;
import java.util.Scanner;

import java.text.DecimalFormat;

public class Shapes {

private static final DecimalFormat df = new DecimalFormat("0.00");

    public static void main(String[] args) {
        shape();
    }
    
    public static void shape(){
        Scanner shape = new Scanner(System.in);
        System.out.println("Choose Shape:\n1. Square\n2. Rectangle\n3. Circle\n4. Triangle\n5. Exit\n");
        int shapeChoice = shape.nextInt();
        switch (shapeChoice){
            case 1 -> square();
            case 2 -> rectangle();
            case 3 -> circle();
            case 4 -> triangle();
            case 5 -> System.exit(0);
            default -> {
                    System.out.println("Unrecognised response");
                    shape();
        }
        }
    }
    
    public static void square(){
        Scanner square = new Scanner(System.in);
        double sqLength;
        
        System.out.println("Square length: ");
        sqLength = square.nextDouble();
        if (sqLength <= 0)
        {
            System.out.println("Number must be positive");
            square();
        }
        System.out.println("Area = " + df.format((Math.pow(sqLength,2))));
        System.out.println("Perimeter = " + df.format((4 * sqLength)));
        shape();
    }
    
    public static void rectangle(){
        Scanner rectangle = new Scanner(System.in);
        double recLength;
        double recHeight;
        
        System.out.println("Rectangle length: ");
        recLength = rectangle.nextDouble();
        if (recLength <= 0)
        {
            System.out.println("Number must be positive");
            rectangle();
        }
        System.out.println("Rectangle Height: ");
        recHeight = rectangle.nextDouble();
        if (recHeight <= 0)
        {
            System.out.println("Number must be positive");
            rectangle();
        }
        System.out.println("Area = " + df.format((recLength * recHeight)));
        System.out.println("Perimeter = " + df.format(((2*recLength) + (2 * recHeight))));
        shape();
    }
    
    public static void circle(){
        Scanner circle = new Scanner(System.in);
        double radius;
        
        System.out.println("Circle Radius: ");
        radius = circle.nextDouble();
        if (radius <= 0)
        {
            System.out.println("Number must be positive");
            circle();
        }
        System.out.println("Area = " + df.format((Math.PI*(radius*radius))));
        System.out.println("Perimeter = " + df.format((2*(Math.PI*radius))));
        shape();
    }
    
    public static void triangle(){
        Scanner triangle = new Scanner(System.in);
        double base;
        double triHeight;
        double side;
        
        System.out.println("Triangle Base: ");
        base = triangle.nextDouble();
        if (base <= 0)
        {
            System.out.println("Number must be positive");
            triangle();
        }
        System.out.println("Triangle Height: ");
        triHeight = triangle.nextDouble();
        if (triHeight <= 0)
        {
            System.out.println("Number must be positive");
            triangle();
        }
        side = (Math.sqrt(Math.pow(base,2)+Math.pow(triHeight,2)));
        
        System.out.println("Area = " + df.format((base * triHeight)/2));
        System.out.println("Perimeter = " + df.format((2 * side + base)));
        shape();
    }
    
}

