/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contenedorSincronizado;

/**
 *
 * @author ruben
 */
public class Test {
    public static void main(String args[]){
        Contenedor cont = new Contenedor();
        
        Productor prod = new Productor(cont);
        prod.start();
        Consumidor cons = new Consumidor(1,cont);
        Consumidor cons2 = new Consumidor(2,cont); 
        Consumidor cons3 = new Consumidor(3,cont);
        cons.start();      
        cons2.start();
        cons3.start();
    }
}
