/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patrones.abstracfactory.services.impl.rest;

import patrones.abstracfactory.services.IEmployeeService;

/**
 * esto simula nuestro servicio rest
 * @author PC
 */
public class EmployeeServiceRestImpl implements IEmployeeService {

    @Override
    public String[] getEmployee() {
        System.out.println("EmployeeServiceRestImpl.getEmployee => ");
        String[] results = new String[]{"Employee1 ", "Employee 2"};
        return results;
    }
    
}
