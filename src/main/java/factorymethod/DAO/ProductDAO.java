/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factorymethod.DAO;

import entities.Product;
import factorymethod.enums.DBType;
import factorymethod.factory.DBAdapterFactory;
import factorymethod.factory.IDBAdapter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * esta clase sirve para hacer operaciones sobre la base de datos
 * aquí no se sabe con qué base de datos vamos a trabajar, sólo se está usando un adaptador
 * que luego hará la conexión mediante los métodos programados
 * @author PC
 */
public class ProductDAO {
   
    /**
     * esto hace referencia a un objeto que implementa la interface. también
     * podemos pensarlo como una variable.
     */
    private IDBAdapter adapter;
    
    /**
     * este es el constructor
     * @param type 
     */
    public ProductDAO(DBType type){
        /**
         * con esto, la variable de tipo IDBAdapter almacena un adaptador de BD
         * según el tipo que se proporciona
         */
        adapter = DBAdapterFactory.getAdapter(type);
    }
    
    
    public void saveProduct(Product product){
        try {
            String sql = "insert into productos values (?,?,?)";
            /**
             * una vez que ya es de un tipo determinado, crea la conexión
             */
            Connection connection = adapter.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setLong(1, product.getId());
            statement.setString(2, product.getName());
            statement.setDouble(3, product.getPrice());
            statement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
    /**
     * esto sirve para consultar todos los productos
     * @return 
     */
    public List<Product> getAllProducts(){
        try {
            String sql = "select *from productos";
            Connection connection = adapter.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet results = statement.executeQuery();
            List<Product> products = new ArrayList<>();
            
             while(results.next()){
                /**
                 * cada número entre parétesis es el número de la columna en 
                 * la que está el valor, también puede ser una etiqueta
                 */
                Long id = results.getLong(1);
                String name = results.getString(2);
                double price = results.getDouble(3);
                Product current = new Product(id, name, price);
                products.add(current);
                
                
            }
             return products;
        } catch (Exception e) {
            e.printStackTrace();
             return null;
        }
        
    }
}
