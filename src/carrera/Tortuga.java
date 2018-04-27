/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrera;

import static java.lang.Thread.yield;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

/**
 *
 * @author ruben
 */
public class Tortuga implements Runnable {
    private String nombre;
    private int distancia;
    private JLabel l;
    private long m;
    public Tortuga(String nombre, int distancia,JLabel jl) {
        this.nombre = nombre;
        this.distancia = distancia;
        l=jl;
    }
    
    public void run() {
        m = (long)(Math.random()*10+1)*10;
       for(int i=1;i<distancia;i++){
           try {
               System.out.println(nombre+" avanza: "+i);
               l.setLocation(i,0);
               int y = (int)(Math.random()*100);
               Thread.sleep(m);
               
           } catch (InterruptedException ex) {
               System.out.println(ex.getMessage());
           }
       }
       yield();//ceder el paso
       System.out.println(nombre+" llegó a la meta");
    }
    
}
