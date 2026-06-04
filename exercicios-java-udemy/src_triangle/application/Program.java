package src_triangle.application;

import java.util.Locale;
import java.util.Scanner;

import src_triangle.entities.Triangle;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Triangle x, y;
        x = new Triangle();
        y = new Triangle();

        System.out.println("Enter the measures of triangle X:  ");
        readTriangleSides(x, sc);
        System.out.println("Enter the measures of triangle Y:  ");
        readTriangleSides(y, sc);

        double areaX = x.area();
        double areaY = y.area();

        System.out.printf("Triangle X area: %.2f%n", areaX);
        System.out.printf("Triangle Y area: %.2f%n", areaY);

        if (areaX > areaY) {
            System.out.println("Larger area: X");
        
        }
        else {
            System.out.println("Larger area: Y");

        }
        sc.close();
    }
    
    private static void readTriangleSides(Triangle t, Scanner sc) {
        t.a = sc.nextDouble();
        t.b = sc.nextDouble();
        t.c = sc.nextDouble();
    }
}
