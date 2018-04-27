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
public class Productor extends Thread {
    private Contenedor cont;

    public Productor(Contenedor c) {
     this.cont=c;
    }
    public void run(){
        for(int i=1;i<=10;i++){
            try {
                this.sleep(4000);
                cont.poner(i);
                //System.out.println("Productor pone: "+i);
                
            } catch (InterruptedException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}
