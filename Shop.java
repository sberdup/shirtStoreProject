package com.ata;
import java.util.ArrayList;

public class Shop{
    private String name;
    private ArrayList<Product> products;
    private Cart cart;
    
    public int numItems;
    
    public Shop(String name, ArrayList<Product> products) {
        this.products = products;
        this.numItems = products.size();
        this.cart = new Cart();
    }
    
    public String getName(){
        return name;
    }
    
    public void printProducts(){
        System.out.println("--Products--");
        for (Product product : products){
            System.out.println("ID " + product.getID() + ": " + product.getName() + " - $" + product.getPrice());
        }
    }
    
    public int findProduct(String searchText){
        for (Product product : products){
            if (product.getName().equals(searchText)){
                return product.getID();
            }
        }
        return -1;
    }
    
    public String getProductName(int id){
        return products.get(id).getName();
    }
    
    public void addToCartById(int id){
        cart.addItem(products.get(id));
    } 
    
    public void cartDetails(){
        cart.showDetails();
    }
    public void cartCheckout(){
        cart.checkout();
    }
}