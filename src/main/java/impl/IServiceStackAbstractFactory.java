/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package impl;

import patrones.abstracfactory.services.IEmployeeService;
import patrones.abstracfactory.services.IProductService;

/**
 * define la estructura mínima de un factory de familia
 * qué productos puede generar un factory
 * @author PC
 */
public interface IServiceStackAbstractFactory {
    /**
     * regresa una instancia concreta de IEmployeeService y IProductService
     * todos los objetos que se se necesiten se van definiendo aquí. 
     */
    
    public IEmployeeService getEmployeeService();
    public IProductService getProducService();
}
