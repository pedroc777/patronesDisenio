/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patrones.abstracfactory;

import impl.IServiceStackAbstractFactory;
import impl.ServiceStackAbstractFactory;
import impl.ServiceType;
import patrones.abstracfactory.services.IEmployeeService;
import patrones.abstracfactory.services.IProductService;

/**
 *
 * @author PC
 */
public class Main {
    public static void main(String[] args) {
        //esto regresa una interface
        IServiceStackAbstractFactory factory = 
                ServiceStackAbstractFactory.createServiceFactory();
        
        //aquí se retornan interfaces
        IEmployeeService employeeService = factory.getEmployeeService();
        IProductService productService = factory.getProducService();
        
        String[] employee = employeeService.getEmployee();
        
        for(String current: employee){
            System.out.println(current);
        }
        
        String[] prodcuts = productService.getProducts();
        for(String current: prodcuts){
            System.out.println(current);
        }
        
        
    }
}
