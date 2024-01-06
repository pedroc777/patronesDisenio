/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package factorymethod.factory;

import java.sql.Connection;

/**
 *
 * @author PC
 */
public interface IDBAdapter {
    
    /**
     * método para crear conexiones a bases de datos
     * @return 
     */
    public Connection getConnection();
}
