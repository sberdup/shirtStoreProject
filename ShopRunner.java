package com.ata;

import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Scanner;
import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.Arrays;
import java.math.BigDecimal;
/**
 * The ShopRunner class is the main entry point for the application.
 * It encapsulates a Menu, providing it with a Scanner configured
 * with System.in to allow the menu to read from standard in.
 * When the application starts, the menu's greet and show methods are called.
 */
public class ShopRunner {
    /**
     * Main entry point to the application.
     * Asks the menu's greeting to be printed to standard out by calling its greet method.
     * Asks the menu to be shown by calling its show method.
     * @param args Command line arguments to the application
     */
    public static void main(@Nullable String[] args) {
        //IMPORTANT: initializing BigDecimal with double instead of string causes loss of precision.
        ArrayList<Product> products = new ArrayList<>(Arrays.asList(new Product(0, "Crew Neck", new BigDecimal("20.00")), new Product(1, "V-Neck", new BigDecimal("20.00")), new Product(2, "Polo", new BigDecimal(25.50)), new Product(3, "Boat Neck", new BigDecimal(30.25)), new Product(4, "Tank Top", new BigDecimal(15.75))));
        Shop shop = new Shop("T-Shirt Mart", products);
        Menu menu = new Menu(new Scanner(new InputStreamReader(System.in, Charset.forName("UTF-8"))), shop, new Cart());
        menu.greet();
        menu.executeMenu();
    }
}
