package com.litmus7.RetailStoreApp.dto;

import java.util.Date;

public class Grocery extends Product {
    private Date expiryDate;
    private double weightKg;

    
    public Grocery(String productId, String productName, ProductStatus status,double price, Date expiryDate, double weightKg) {
        super(productId, productName,"Grocery", status, price);
        this.expiryDate=expiryDate;
        this.weightKg=weightKg;
    }

    public Date getExpiryDate() { 
    	return expiryDate; 
    }
   
    public double getWeightKg() { 
    	return weightKg; 
    }
   
}