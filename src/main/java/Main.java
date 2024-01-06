import factorymethod.factory.MySQLAdapter;
import factorymethod.factory.OracleAdapter;
import java.sql.Connection;


public class Main {
    public static void main(String[] args) {
        OracleAdapter adapter = new OracleAdapter();
        Connection connection = adapter.getConnection();
        /*MySQLAdapter adapter = new MySQLAdapter();
        Connection connection = adapter.getConnection();*/
        /*Product product1 = new Product(3l, "Producto 2", 30);
        
        ProductDAO dao = new ProductDAO();
        //dao.saveProduct(product1);
        
        List<Product> allProducts = dao.getAllProducts();
        for(Product current : allProducts){
            System.out.println(current);
        }*/
        
        
    }
}