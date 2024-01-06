/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factorymethod.factory;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author PC
 */
public class MySQLAdapter implements IDBAdapter {
    /**
     * instanciación del driver
     */
    static{
        try{
            new com.mysql.cj.jdbc.Driver();
        }
        catch(Exception e){
            
        }
    }
    @Override
    public Connection getConnection() {
         try {
            String connectionString = getConnectionString();
            String user = "root";
            String password = "mypassword1";
            Connection connection = DriverManager.getConnection(connectionString, user, password);
            /*
            para ver lo que se está instanciando. si todo sale bien debe regresar el nombre que
            genera la conexión
            */ 
            System.out.println("Connection class => " + connection.getClass().getCanonicalName());
            return connection;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    private String getConnectionString(){
        /**
         * debe llevar el nombre de la bd después del puerto
         */
        return "jdbc:mysql://localhost:3306/ventas2?zeroDateTimeBehavior=convertToNull&serverTimezone=UTC";
    }
    
}
