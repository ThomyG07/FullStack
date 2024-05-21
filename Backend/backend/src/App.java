import database.PolyBayDatabase;
import models.Product;
public class App {
    public static void main(String[] args) throws Exception {
        PolyBayDatabase polyBayDatabase = new PolyBayDatabase();
        Product product  = new Product(1, "toto", "NONO", 0.5f);
        System.out.println(product.id());
    }
}
