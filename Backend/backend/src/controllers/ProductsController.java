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
    static public void findAll(WebServerContext context, ArrayList<Product> products )
    {
        WebServerResponse response = context.getResponse();
        response.json(products);
    }

}
