/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contenedorArrSincronizado;


/**
 *
 * @author ruben
 */
public class Test {
    public static void main(String args[]){
        Contenedor cont = new Contenedor();
        Consumidor cons = new Consumidor(cont);
        Productor prod = new Productor(cont);       
        prod.start();
        cons.start();
        
        
    }
}
