package com.litmus7.RetailStoreApp.dao;

import com.litmus7.RetailStoreApp.dto.Product;
import com.litmus7.RetailStoreApp.exception.RetailStoreDAOException;

import java.util.List;

public class ProductDAO {

   

    public boolean saveProduct(Product product) throws RetailStoreDAOException {
        //  1: insert product to database
        return false;
    }

    public List<Product> getAllProducts() throws RetailStoreDAOException {
        //  1: Read all products from database
        //  2: Return products.
        return null;
    }

    public List<Product> getProductsByCategory(String category) throws RetailStoreDAOException {
        //  1: Read products of given category from database
        //  2: Return list of products.
        return null;
    }
}