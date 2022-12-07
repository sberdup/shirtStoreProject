package com.ata;
import java.math.BigDecimal;

public class Product {
    private String name;
    private BigDecimal price;
    private int id;
    //BIGDECIMAL for price can work if you use BigDecimal ex = new BigDecimal(100); 
    //REQUIRES IMPORTING java.math.BigDecimal
    //CLASS **NOT** PRIMITIVE
    public Product(int id, String name, BigDecimal price){
        this.id = id;
        this.name = name;
        this.price = price;
    }
    public String getName(){
        return name;
    }
    public BigDecimal getPrice(){
        return price;
    }
    public int getID(){
        return id;
    }
}