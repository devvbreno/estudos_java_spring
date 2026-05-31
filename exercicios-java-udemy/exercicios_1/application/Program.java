package exercicios_1.application;

import java.util.Scanner;
import java.util.Locale;

import exercicios_1.entities.Rectangle;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Rectangle rect = new Rectangle();

        System.out.println("Enter rectangle width and height: ");
        readRectangleSides(rect, sc);

        double areaRect = rect.area();
        System.out.printf("AREA = %.2f%n", areaRect);

        double perimeterRect = rect.perimeter();
        System.out.printf("PERIMETER = %.2f%n", perimeterRect);

        double diagonalRect = rect.diagonal();
        System.out.printf("DIAGONAL = %.2f%n", diagonalRect);

        sc.close();
    }

    private static void readRectangleSides(Rectangle r, Scanner sc){
        r.width = sc.nextDouble();
        r.height = sc.nextDouble();
    }
}