package com.ata;
import java.util.ArrayList;

public class Shop{
    private String name;
    private ArrayList<Product> products;
        
    public Shop(String name, ArrayList<Product> products) {
        this.name = name;
        this.products = products;
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
    
    // this maybe can replace getProductName
    public Product getProductById(int id){
        return products.get(id);
    }
    
    //this is to return product name since shop products are private outside shop
    public String getProductName(int id){
        return products.get(id).getName();
    }
    
}