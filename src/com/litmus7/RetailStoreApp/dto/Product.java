package com.litmus7.RetailStoreApp.dto;

public abstract class Product {
    protected String productId;
    protected String productName;
    protected String category;
    protected ProductStatus status;
    protected double price;

    

    public Product(String productId, String productName, String category, ProductStatus status, double price) {
        this.productId = productId;
        this.productName = productName;
        this.category=category;
        this.status = status;
        this.price = price;
    }

    public String getProductId() { 
    	return productId; 
    }
    

    public String getProductName() { 
    	return productName; 
    }
    
    
    public String getCategory() {
    	return category;
    }
    
   
    
    public ProductStatus getStatus() { 
    	return status; 
    }
    
   

    public double getPrice() { 
    	return price; 
    }
   


}