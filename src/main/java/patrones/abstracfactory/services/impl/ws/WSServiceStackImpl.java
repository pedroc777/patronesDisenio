/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patrones.abstracfactory.services.impl.ws;

import impl.IServiceStackAbstractFactory;
import patrones.abstracfactory.services.IEmployeeService;
import patrones.abstracfactory.services.IProductService;

/**
 * implementa la interface de servicios stack. y se va a usar para obtener los
 * servicios a utilizar durante el tiempo de ejecución. crea los servicios
 * 
 * @author PC
 */
public class WSServiceStackImpl implements IServiceStackAbstractFactory{

    @Override
    public IEmployeeService getEmployeeService() {
        return new EmployeeServiceWSImpl();
    }

    @Override
    public IProductService getProducService() {
        return new ProductServiceWSImpl();
    }
    
}
