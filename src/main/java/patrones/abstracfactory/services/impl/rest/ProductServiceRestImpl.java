/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patrones.abstracfactory.services.impl.rest;

import patrones.abstracfactory.services.IProductService;

/**
 *
 * @author PC
 */
public class ProductServiceRestImpl implements IProductService{

    @Override
     public String[] getProducts() {
        System.out.println("ProductServiceRestImpl.getProducts => ");
        String[] results = new String[]{"Product 1", "Product 2"};
        return results;
    }

    
}
