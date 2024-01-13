/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package impl;

import java.io.InputStream;
import java.util.Properties;
import patrones.abstracfactory.services.impl.rest.RestServiceStackImpl;
import patrones.abstracfactory.services.impl.ws.WSServiceStackImpl;

/**
 * con esto se determina el factory que se va a retornar según el service type
 *
 * @author PC
 */
public class ServiceStackAbstractFactory {

    /**
     * esta variable define dónde está el archivo de propiedades
     *
     * @param type
     * @return
     */
    private static final String CONFIG_PATH = "META-INF/abstractfactory.properties";

    public static IServiceStackAbstractFactory createServiceFactory() {

        try {
            //esto es para cuando no usamos el archivo de propiedades
            Properties props = loadProperties();
            //regresa el canonical path de la clase faftory concreta, de la familia
            String concreteFactory = props.getProperty("defaultFamily");
            
            /**
             * esto reflection. crea la clase a partir de un string.
             * 
             * hay que castearlo
             */
            IServiceStackAbstractFactory factoryImpl = (IServiceStackAbstractFactory)Class.forName(concreteFactory).newInstance();
            return factoryImpl;
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
            InputStream stream = ServiceStackAbstractFactory.class.getClassLoader().getResourceAsStream(CONFIG_PATH);
            p.load(stream);

            return p;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
