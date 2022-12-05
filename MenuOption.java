package com.ata;

public enum MenuOption{
    EXIT(0, "Exit"), LIST_PRODUCTS(1, "List Products"), BUY_PRODUCT(2, "Buy Product"), FIND_PRODUCT(3, "Find Product"), SHOW_CART(4, "Show Cart"), CHECKOUT(5, "Checkout");
    
    private int id;
    private String displayValue;
    
    private MenuOption(int id, String displayValue){
        this.id = id;
        this.displayValue = displayValue;
    }
    
    public int getId(){
        return id;
    }
    
    public String getDisplayValue(){
        return displayValue;
    }
    
    public static MenuOption fromOptionId(int optionId){
        MenuOption[] options = values();
        return options[optionId];
    }
    
}