package com.litmus7.RetailStoreApp.service;

import com.litmus7.RetailStoreApp.dao.ProductDAO;
import com.litmus7.RetailStoreApp.dto.Product;
import com.litmus7.RetailStoreApp.exception.RetailStoreServiceException;

import java.util.Comparator;
import java.util.List;

public class ProductService {
    ProductDAO dao = new ProductDAO();

    public boolean addProduct(Product product) throws RetailStoreServiceException {
        //  1: Call saveproduct function in dao class
     
        return false;
    }

    public List<Product> viewAllProducts() throws RetailStoreServiceException {
        //  1: Call getallproducts function in dao class
        //  2: Return products.
        return null;
    }

    public List<Product> viewProductsByCategory(String category) throws RetailStoreServiceException {
        //  1: Call getproductsbycategory function in dao class
        //  2: Return products.
        return null;
    }

    public List<Product> sortProducts(Comparator<Product> comparator) throws RetailStoreServiceException {
        //  1: Call getallproducts function in dao class
        //  2: Sort the products using the comparator.
        //  3: Return sorted list.
        return null;
    }
}