package src_.app;

import java.util.Locale;
import java.util.Scanner;

import src_.entities.Product;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        Product product = new Product();
        System.out.println("Enter product data ---> ");
        System.out.println("Name: ");
        product.name = sc.nextLine();
        System.out.println("Select price: ");
        product.price = sc.nextDouble();
        System.out.println("Select quantity: ");
        product.quantity = sc.nextInt();

        System.out.println(product.name + " , " + product.price + " , " + product.quantity );

        sc.close();
    }

}
