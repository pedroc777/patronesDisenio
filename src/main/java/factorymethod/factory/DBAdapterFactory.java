/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factorymethod.factory;

import factorymethod.enums.DBType;
import java.io.InputStream;
import java.util.Properties;

/**
 *
 * @author PC
 */
public class DBAdapterFactory {

    /**
     *
     * @param type es el tipo de base de datos que se va a elegir en cada caso
     */
    /*public static IDBAdapter getAdapter(DBType type){
        switch (type){
            //aquí sólo se pone el nombre del enum, no de la clase
            case ORACLE:
                return new OracleAdapter();
            case MYSQL:
                return new MySQLAdapter();
            default:
                return null;
        }
    }*/

    /**
     * este nuevo método va a asumir el tipo de adaptador dque se necesita por
     * ello ya no va a necesitar el parámetro
     */
    //para recuperar la propiedad generamos una constante
    private static final String DB_TYPE = "dbadaptertype";

    /**
     *
     * @return
     */
    public static IDBAdapter getAdapter() {
        /**
         * recuperamos la propiedad que tengo en el archivo de texto
         */
        try {
            Properties p = loadProperties();
            String dbType = p.getProperty(DB_TYPE);
            
            /**
             * esto es reflection para instanciar una clase.
             */
            return (IDBAdapter)Class.forName(dbType).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }

    private static Properties loadProperties() {
        try {
            Properties p = new Properties();

            /**
             * esto sirve para leer un elemento que esté en una ubicación
             * debemos indicar la ruta del mismo
             */
            InputStream stream = DBAdapterFactory.class.getClassLoader().getResourceAsStream("META-INF/dbadapter.properties");
            p.load(stream);
            
            return p;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
