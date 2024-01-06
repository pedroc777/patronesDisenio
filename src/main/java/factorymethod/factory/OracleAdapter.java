/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factorymethod.factory;

import java.sql.Connection;
import oracle.jdbc.OracleDriver;
import java.sql.DriverManager;

/**
 *
 * @author PC
 */
public class OracleAdapter implements IDBAdapter{
    
    //instanciamos los drivers
    static{
        try{
           new OracleDriver(); 
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    @Override
    public Connection getConnection() {
        try{
            String urlConnection = getConnectionString();
            String user = "system";
            String password = "123";
            Connection connection = DriverManager.getConnection(urlConnection,user,password); 
            System.out.println("Connection class => " + connection.getClass().getCanonicalName());
            return connection;
        }
        catch(Exception e){
            //e.printStackTrace();
            System.out.println("haz de cuenta que sí se conectó wee");
            return null;
        }
        //return null;
        
    };
    
    //para obtener el string de conexiones
    public String getConnectionString(){
        return "jdbc:oracle:thin:@localhost:1522:orcl2";
    }
    
}
