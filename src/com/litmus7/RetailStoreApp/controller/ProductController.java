package com.litmus7.RetailStoreApp.controller;

import com.litmus7.RetailStoreApp.dto.Product;
import com.litmus7.RetailStoreApp.dto.Response;
import com.litmus7.RetailStoreApp.service.ProductService;

import java.util.Comparator;
import java.util.List;

public class ProductController {
	ProductService productService=new ProductService();
	
    public Response<Boolean> addProduct(Product product) {
        // Step 1: Validate user input
        // Step 2: Call service to add product
    	// Step 3: Return response.
        return null;
    }

    public Response<List<Product>> viewAllProducts() {
        // Step 1: Call service to get all products
    	// Step 2: Return response
        return null;
    }

    public Response<List<Product>> viewProductsByCategory(String category) {
        // Step 1: Call service to get category products
    	// Step 2: Return response
        return null;
    }

    public Response<List<Product>> sortProducts(Comparator<Product> comparator) {
        // Step 1: Call service to sort products
    	// Step 2: Return response
        return null;
    }
}