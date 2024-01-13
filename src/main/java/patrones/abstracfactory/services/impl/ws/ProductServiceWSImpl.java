/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patrones.abstracfactory.services.impl.ws;

import patrones.abstracfactory.services.IProductService;

/**
 * esto es sólo para la familia de servicios SOA
 * @author PC
 */
public class ProductServiceWSImpl implements IProductService{

    @Override
    public String[] getProducts() {
        System.out.println("ProductServiceWSImpl.getProducts => ");
        String[] results = new String[]{"Product 1", "Product 2"};
        return results;
    }
    
}
