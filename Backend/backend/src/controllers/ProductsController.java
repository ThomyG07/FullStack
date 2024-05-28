package controllers;

import java.sql.SQLException;
import java.util.ArrayList;

import javax.naming.Context;

import dao.ProductsDAO;
import models.Product;
import webserver.WebServerResponse;
import webserver.WebServerContext;

public class ProductsController {
    public ProductsController()
    {

    }
    static public ArrayList<Product> findAll(WebServerContext context) throws SQLException
    {
        ProductsDAO productsDAO = new ProductsDAO();
        ArrayList<Product> products = productsDAO.findAll();
        WebServerResponse response = context.getResponse();
        response.json(products);
        return products;
    }

}
