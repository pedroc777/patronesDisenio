import entities.Product;
import factorymethod.DAO.ProductDAO;
import factorymethod.enums.DBType;
import factorymethod.factory.DBAdapterFactory;
import factorymethod.factory.IDBAdapter;
import factorymethod.factory.MySQLAdapter;
import factorymethod.factory.OracleAdapter;
import java.sql.Connection;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        /**
         * para oracle es lo mismo
         */
        Product product1 = new Product(2l,"Producto 2",20);
        ProductDAO  dao = new ProductDAO(DBType.MYSQL);
        
        dao.saveProduct(product1);
        List<Product> allProducts = dao.getAllProducts();
        
        for(Product current : allProducts){
            System.out.println(current);
        }
        /*
        quitamos las clases y las reemplazamos por interfaces
        */
        /*IDBAdapter adapter = DBAdapterFactory.getAdapter(DBType.ORACLE);
        Connection connection = adapter.getConnection();*/
        /*OracleAdapter adapter = new OracleAdapter();
        Connection connection = adapter.getConnection();*/
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