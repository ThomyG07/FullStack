package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import database.MySQLDatabase;
import database.PolyBayDatabase;
import models.Product;

public class ProductsDAO {
    private PolyBayDatabase polyBayDatabase;
    public ProductsDAO() throws SQLException
    {
        polyBayDatabase = new PolyBayDatabase();
        
        

    }
     public  ArrayList<Product> findAll() throws SQLException
    {
        ArrayList<Product> products = new ArrayList<>();
        PreparedStatement myStatement = polyBayDatabase.prepareStatement("SELECT * FROM `product` ORDER BY NAME");
         
         try
         {
            ResultSet results = myStatement.executeQuery();
            while(results.next())
            {
                String product_name = results.getString("name");
                String owner_name = results.getString("owner");
                int id = results.getInt("id");
                float valeur  = results.getFloat("bid");
                products.add(new Product(id, product_name, owner_name, valeur ));
                
            }

         }
         catch(SQLException e)
         {
            System.err.println("Erreur SQL selection table : " + e.getMessage());
         }
        return products;
    }
}
