package OopsConcept.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Product> products = new ArrayList<>();
        for(int i =0;i<5;i++) {
            double price = sc.nextDouble();
            String name = sc.next();
            int quantity = sc.nextInt();
            Product p = new Product(name, price,quantity);
            products.add(p);
        }
        double totalPrice = 0.00;

        for(Product p : products){
            totalPrice += p.price * p.quantity;
        }
        System.out.println("You have to pay Rs : "+totalPrice);
    }

}
