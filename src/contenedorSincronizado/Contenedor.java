/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contenedorSincronizado;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ruben
 */
public class Contenedor {
    private int dato;
    public boolean hayDato = false;
    
    public Contenedor(){}
    
    public synchronized int sacar(){
        while(hayDato == false){
            try {
                wait();
            } catch (InterruptedException ex) {
                System.out.println(ex.getMessage());
            }
        }
        hayDato = false;
        notifyAll();
        return dato;
    }
    public synchronized void poner(int valor){
        while(hayDato==true){
            try {
                wait();
            } catch (InterruptedException ex) {
                System.out.println(ex.getMessage());
            }
        }
        dato = valor;
        hayDato=true;
        notifyAll();
    }
}
