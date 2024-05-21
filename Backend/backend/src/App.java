import java.util.ArrayList;

import dao.ProductsDAO;
import database.PolyBayDatabase;
import models.Product;
public class App {
    public static void main(String[] args) throws Exception {
        ProductsDAO productsDAO = new ProductsDAO();
        ArrayList<Product> products = productsDAO.findAll();
        for (Product product : products) 
       {
           System.out.println(product.id() +" "+ product.name() + " " +product.owner() +" "+ product.bid());
           
       }
    }
}
