package controllers;

import java.util.ArrayList;

import javax.naming.Context;

import models.Product;
import webserver.WebServerResponse;
import webserver.WebServerContext;

public class ProductsController {
    public ProductsController()
    {

    }
    static public  ArrayList<Product> findAll(WebServerContext context )
    {
        WebServerResponse response = context.getResponse();
        response.ok("Tous les produits");
        return null;



    }

}
