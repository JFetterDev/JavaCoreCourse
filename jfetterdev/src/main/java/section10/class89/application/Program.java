package section10.class89.application;

import section10.class89.entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
    // Making a program that read and storage a data (name and price) from an integer number N of products.
    // and save the data in an array, then return the average price of the products:
    // Use Objects class and make an instance

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("How many products will you input? ");
        int n = sc.nextInt();
        Product[] vect = new Product[n];

        for (int i = 0; i < n;i ++ ) {
            sc.nextLine();
            System.out.println("Write the name of the product to be added: ");
            String name = sc.nextLine();
            System.out.println("Write the price of the product to be added: ");
            double price = sc.nextDouble();
            vect[i] = new Product(name, price);
        }

        double sum = 0.0;
        for (int i=0; i<n; i++) {
            sum += vect[i].getPrice();
        }
        double avg = sum / n;
        System.out.printf("Average price of products: %.2f%n", avg);

        sc.close();
    }
}
