package com.litmus7.RetailStoreApp.service;

import com.litmus7.RetailStoreApp.dao.ProductDAO;
import com.litmus7.RetailStoreApp.dto.Product;
import com.litmus7.RetailStoreApp.exception.RetailStoreServiceException;

import java.util.Comparator;
import java.util.List;

public class ProductService {
    ProductDAO dao = new ProductDAO();

    public boolean addProduct(Product product) throws RetailStoreServiceException {
        // Step 1: Validate product.
        // Step 2: Call DAO to save product.
        // Step 3: If any error occurs, throw ProductServiceException.
        return false;
    }

    public List<Product> viewAllProducts() throws RetailStoreServiceException {
        // Step 1: Call DAO to get all products.
        // Step 2: If any error occurs, throw ProductServiceException.
        // Step 3: Return list of products.
        return null;
    }

    public List<Product> viewProductsByCategory(String category) throws RetailStoreServiceException {
        // Step 1: Call DAO to get products by category.
        // Step 2: If any error occurs, throw ProductServiceException.
        // Step 3: Return list of products.
        return null;
    }

    public List<Product> sortProducts(Comparator<Product> comparator) throws RetailStoreServiceException {
        // Step 1: Call DAO to get all products from CSV.
        // Step 2: Sort the fetched list using the given comparator.
        // Step 3: If any error occurs, throw ProductServiceException.
        // Step 4: Return sorted list.
        return null;
    }
}