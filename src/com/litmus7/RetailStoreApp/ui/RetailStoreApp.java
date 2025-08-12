package com.litmus7.RetailStoreApp.ui;

import java.util.List;

import com.litmus7.RetailStoreApp.controller.ProductController;
import com.litmus7.RetailStoreApp.dto.Product;
import com.litmus7.RetailStoreApp.dto.Response;

public class RetailStoreApp {

    public static void main(String[] args) {
        ProductController productController = new ProductController();

        // 1. Add a product
        // Create a category object and fill details
        // Save via controller and store response
        Response<Boolean> addProductResponse = productController.addProduct(null); // pass product instance
        // Use addProductResponse to show result

        // 2. Show all products
        Response<List<Product>> viewAllResponse = productController.viewAllProducts();
        // Use viewAllResponse to display products

        // 3. Show products by category
        Response<List<Product>> productCategoryResponse = productController.viewProductsByCategory("categoryName");
        // Use productCategoryResponse to display category results

        // 4. Sort products
        // Pick comparator (priceAsc, priceDesc, nameAsc) and pass to sortProducts
        Response<List<Product>> sortProductResponse = productController.sortProducts(null); // pass comparator
        // Use sortProductResponse to display sorted list
    }
}