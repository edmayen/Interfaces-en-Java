/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejointerfaces;
import datos.*;
/**
 *
 * @author edmayen
 */
public class ManejoInterfaces {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        AccesoDatos datos=new ImplementacionOracle();
        ejecutar(datos,"listar");
        
        datos = new ImplementacionMysql();
        ejecutar(datos,"insertar");
        
    }
    
    
    private static void ejecutar(AccesoDatos datos, String accion)
    {
        if("listar".equals(accion))
        {
            datos.listar();
        }
        else if("insertar".equals(accion))
        {
            datos.insertar(); 
        }
            
    }
}
