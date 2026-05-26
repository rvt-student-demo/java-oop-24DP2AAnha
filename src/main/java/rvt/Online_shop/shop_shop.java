package rvt.Online_shop;
import java.util.Scanner;

public class shop_shop {

    private shop_stock stock;
    private Scanner scanner;

    public shop_shop(shop_stock stock, Scanner scanner) {
        this.stock = stock;
        this.scanner = scanner;
    }
    public void shop(String customer) {
        shop_cart cart = new shop_cart();
        System.out.println("Welcome to the store " + customer);
        System.out.println("our selection:");

        for (String product : this.stock.products()) {
            System.out.println(product);
        }

        while (true) {
            System.out.print("What to put in the cart (press enter to go to the register): ");
            String product = scanner.nextLine();

            if (product.isEmpty() || !stock.products().contains(product)) {
                break;
            }
            cart.add(product, stock.price(product));
        }

        System.out.println("your shopping cart contents:");
        cart.print();
        System.out.println("total: " + cart.price());
    }
}
