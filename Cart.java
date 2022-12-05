package com.ata;
import java.util.ArrayList;

public class Cart {
    private ArrayList<Product> items = new ArrayList<>();
    private double total = 0;
    private double taxRate = 10.00;
    
    public void addItem(Product p){
        items.add(p);
        total += p.getPrice();
        System.out.println(p.getName() + " has been added to your cart.");
    }
    
    private void empty(){
        items.clear();
    }
    
    public void checkout(){
        if (items.size() == 0){
            System.out.println("Your cart is currently empty. Please add at least one product to check out.");
        } else {
            String taxTotal = String.format("Your total is $%.2f", (total * (1 + taxRate/100)));
            System.out.println(taxTotal);
            System.out.println("Thank you for shopping at T-Shirt Mart.");
            empty();
        }
    }
    
    public void showDetails(){
        if (items.size() == 0){
            System.out.println("The cart is empty. Please add at least one product to see it in the cart.");
        } else {
            double taxTotal = total * (1 + taxRate/100);
            String string1 = String.format("--Cart--%nItem Count: %d%nItems:", items.size());
            String string2 = String.format("%nPre-Tax Total: $%.2f%nPost-Tax Total (%.2f%% Tax): $%.2f", total, taxRate, taxTotal);
            System.out.println(string1);
                for (Product item : items){
                    String output = String.format("%s: $%.2f", item.getName(), item.getPrice());
                    System.out.println(output);
                }
            System.out.println(string2);
        }
    }
    
}