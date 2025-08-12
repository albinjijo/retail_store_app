package com.litmus7.RetailStoreApp.controller;

import com.litmus7.RetailStoreApp.dto.Product;
import com.litmus7.RetailStoreApp.dto.Response;
import com.litmus7.RetailStoreApp.service.ProductService;

import java.util.Comparator;
import java.util.List;

public class ProductController {
	ProductService productService=new ProductService();
	
    public Response<Boolean> addProduct(Product product) {
        //  1: Validate user input
        //  2: Call addproduct function in service class
        return null;
    }

    public Response<List<Product>> viewAllProducts() {
        //  1: Call viewAllProducts in service class
    	//  2: Return response
        return null;
    }

    public Response<List<Product>> viewProductsByCategory(String category) {
        //  1: Call viewProductsbycategory in service class
    	//  2: Return response
        return null;
    }

    public Response<List<Product>> sortProducts(Comparator<Product> comparator) {
        //  1: Call sortproducts in service class
    	//  2: Return response
        return null;
    }
}