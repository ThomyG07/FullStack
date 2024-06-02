package controllers;

import java.sql.SQLException;
import java.util.ArrayList;

import javax.naming.Context;

import dao.ProductsDAO;
import models.Product;
import webserver.WebServerResponse;
import webserver.WebServerContext;
import webserver.WebServerRequest;

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

    static public void bid(WebServerContext context)
    {
        ProductsDAO productsDAO;
        try {
            productsDAO = new ProductsDAO();
            WebServerRequest request = context.getRequest();
            int id =  Integer.parseInt(request.getParam("productId"));
            System.err.println(id);
            productsDAO.bid(id);
            try
            {
            WebServerResponse response = context.getResponse();
            response.ok("ok");
            }
            catch(Exception e)
            {
                WebServerResponse response = context.getResponse();
                response.serverError("erreur server");

                
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
           
        }
        
        


    }

}
