/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patrones.abstracfactory.services.impl.ws;

import patrones.abstracfactory.services.IEmployeeService;

/**
 * Vamos a simular que estamos construyendo el servicio web soa
 * esto es sólo para la familia de servicios SOA
 * @author PC
 */
public class EmployeeServiceWSImpl implements IEmployeeService {

    @Override
    public String[] getEmployee() {
        System.out.println("EmployeeServiceWSImpl.getEmployee => ");
        String[] results = new String[]{"Employee1 ", "Employee 2"};
        return results;
    }

}
