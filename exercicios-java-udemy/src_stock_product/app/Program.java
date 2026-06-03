package src_.app;

import java.util.Locale;
import java.util.Scanner;

import src_.entities.Product;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
                
        System.out.println("Enter product data ---> ");
        System.out.println("Name: ");
        String name = sc.nextLine();
        System.out.println("Select price: ");
        Double price = sc.nextDouble();
        System.out.println("Select quantity: ");
        int quantity = sc.nextInt();
        Product product = new Product(name, price, quantity);

        product.setName("Computer");
        System.out.println("Update name: ", product.getName());
        product.setPrice(120);
        System.out.println("Update price: ", product.getPrice());

        sc.close();
    }

}
