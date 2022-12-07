package com.ata;
import java.util.ArrayList;
import java.math.BigDecimal;

public class Cart {
    private ArrayList<Product> items = new ArrayList<>();
    private BigDecimal total = new BigDecimal(0);
    private double taxRate = 10.00;
    
    public void addItem(Product p){
        items.add(p);
        total = total.add(p.getPrice());
        System.out.println(p.getName() + " has been added to your cart.");
    }
    
    private void empty(){
        items.clear();
    }
    
    public void checkout(){
        if (items.size() == 0){
            System.out.println("Your cart is currently empty. Please add at least one product to check out.");
        } else {
            System.out.println(String.format("Your total is $%.2f%nThank you for shopping at T-Shirt Mart.", (total.doubleValue() * (1 + taxRate/100))));
            empty();
        }
    }
    
    public void showDetails(){
        if (items.size() == 0){
            System.out.println("The cart is empty. Please add at least one product to see it in the cart.");
        } else {
            StringBuilder output = new StringBuilder();
            System.out.println(appendCartTotalsToStringBuilder(appendItemsWithPricesToStringBuilder(appendCartHeaderToStringBuilder(output))).toString());
        }
    }
    
    private StringBuilder appendCartHeaderToStringBuilder(StringBuilder sb){
        sb.append(String.format("--Cart--%nItem Count: %d%nItems:", items.size()));
        return sb;
    }
    private StringBuilder appendItemsWithPricesToStringBuilder(StringBuilder sb){
        for (Product item : items){
                    sb.append(String.format("%n%s: $%.2f", item.getName(), item.getPrice()));
         }
        return sb;
    }
    private StringBuilder appendCartTotalsToStringBuilder(StringBuilder sb){
        double taxTotal = total.doubleValue() * (1 + taxRate/100);
        //the first %n merely pushes it from the previous line, two are need to get a blank line
        sb.append(String.format("%n%nPre-Tax Total: $%.2f%nPost-Tax Total (%.2f%% Tax): $%.2f", total, taxRate, taxTotal));
        return sb;
    }
    
}