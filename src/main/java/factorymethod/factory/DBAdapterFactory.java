/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factorymethod.factory;

import factorymethod.enums.DBType;

/**
 *
 * @author PC
 */
public class DBAdapterFactory {
    /**
     * 
     * @param type es el tipo de base de datos que se va a elegir en cada caso 
     */
    public static IDBAdapter getAdapter(DBType type){
        switch (type){
            //aquí sólo se pone el nombre del enum, no de la clase
            case ORACLE:
                return new OracleAdapter();
            case MYSQL:
                return new MySQLAdapter();
            default:
                return null;
        }
    }
}
