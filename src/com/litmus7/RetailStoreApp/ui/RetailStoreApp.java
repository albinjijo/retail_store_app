package com.litmus7.RetailStoreApp.ui;

import java.util.List;

import com.litmus7.RetailStoreApp.controller.ProductController;
import com.litmus7.RetailStoreApp.dto.Product;
import com.litmus7.RetailStoreApp.dto.Response;

public class RetailStoreApp {

    public static void main(String[] args) {
        ProductController productController = new ProductController();

        // 1. Add product
        
        Response<Boolean> addProductResponse = productController.addProduct(null);

        // 2. View all products
        Response<List<Product>> viewAllProductsResponse = productController.viewAllProducts();

        // 3. view products by category
        Response<List<Product>> viewProductsByCategoryResponse = productController.viewProductsByCategory("categoryName");

        // 4. Sort products
        Response<List<Product>> sortProductsResponse = productController.sortProducts(null); 
    }
}