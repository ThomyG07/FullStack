import java.util.ArrayList;

import controllers.ProductsController;
import dao.ProductsDAO;
import database.PolyBayDatabase;
import models.Product;
import webserver.WebServer;
import webserver.WebServerContext;
public class App {
    public static void main(String[] args) throws Exception {
        ProductsDAO productsDAO = new ProductsDAO();
        ArrayList<Product> products = productsDAO.findAll();
        WebServer webserver = new WebServer();
        webserver.listen(8080);
        webserver.getRouter().get(
 "/products",
 (WebServerContext context) -> { ProductsController.findAll(context,products); }
);

    }
}
