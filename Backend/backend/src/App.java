import java.sql.SQLException;
import java.util.ArrayList;

import controllers.ProductsController;
import dao.ProductsDAO;
import database.PolyBayDatabase;
import models.Product;
import webserver.WebServer;
import webserver.WebServerContext;

public class App {
    public static void main(String[] args) throws Exception {
       
        WebServer webserver = new WebServer();
        webserver.listen(8080);
        webserver.getRouter().get(
 "/products",
 (WebServerContext context) -> { try {
    ProductsController.findAll(context);
} catch (SQLException e) {
    e.printStackTrace();
} }
);
webserver.getRouter().post(
    "/bid/:productId",
 (WebServerContext context) -> { ProductsController.bid(context); }
);
    }
}
