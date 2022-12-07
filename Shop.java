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
        StringBuilder output = new StringBuilder("--Products--");
        for (Product product : products){
            //need to tag BigDecimal as %float when formatting
            output.append(String.format("%nID %d: %s - $%.2f", product.getID(), product.getName(), product.getPrice()));
        }
        System.out.println(output.toString());
    }
    
    public int findProduct(String searchText){
        for (Product product : products){
            if (product.getName().equals(searchText)){
                return product.getID();
            }
        }
        return -1;
    }
    //replaces getProductName as well
    public Product getProductById(int id){
        return products.get(id);
    }
}