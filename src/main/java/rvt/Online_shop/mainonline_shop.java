package rvt.Online_shop;

import java.util.Scanner;

public class mainonline_shop {
    public static void main(String[] args) {
    shop_stock stock = new shop_stock(); 

    stock.addProduct("coffee", 5, 10);
    stock.addProduct("milk", 3, 20);
    stock.addProduct("cream", 2, 55);
    stock.addProduct("bread", 7, 8);

    Scanner scanner = new Scanner(System.in);

    shop_shop shop = new shop_shop(stock, scanner);
    shop.shop("John"); 
    }
}