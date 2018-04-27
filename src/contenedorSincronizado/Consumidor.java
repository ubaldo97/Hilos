/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contenedorSincronizado;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ruben
 */
public class Consumidor extends Thread {
    private Contenedor cont;
    private int id;

    public Consumidor(int i,Contenedor c) {
        this.cont = c;
        id=i;
    }
    public void run(){
        for(int i=0;i<10;i++){
            try {
                Thread.sleep(1000);
                if(cont.hayDato){
                System.out.println("Proceso: "+id+" obtiene el recurso");
                cont.sacar();
                Random ran = new Random();
                int r = ran.nextInt(3)+1;
                Thread.sleep(r);
                System.out.println("Proceso: "+id+" Libera el recurso");}
            } catch (InterruptedException ex) {
                Logger.getLogger(Consumidor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    
}
