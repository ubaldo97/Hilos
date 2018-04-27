/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contenedor;

import static java.lang.Math.random;
import java.util.Random;

/**
 *
 * @author ruben
 */
public class Contenedor {
    private String[] cont = new String[10];

    public Contenedor() {
        this.cont[0] = "hola";
        this.cont[1] = "adios";
        this.cont[2] = "hi";
        this.cont[3] = "hello";
        this.cont[4] = "goodbye";
        this.cont[5] = "como";
        this.cont[6] = "estas";
        this.cont[7] = "bien";
        this.cont[8] = "ups";
        this.cont[9] = "blabla";
        
    }

    public static void main(String args[]) {
        Random ran = new Random();        
       Contenedor c = new Contenedor();
       for(int i=0;i<10;i++){
         int m1 = ran.nextInt(9)+1;
         int m2 = ran.nextInt(9)+1;
         HiloMeter hm = new HiloMeter(c.sacar(),m1,"jaja");
         HiloSacar hs = new HiloSacar(c.sacar(),m2);     
         Thread h1 = new Thread(hm);
         Thread h2 = new Thread(hs);        
         h1.start();
         h2.start();  
         System.out.println(c.sacar());       
         System.out.println();
       }
    }

    public String[] sacar() {
        return cont;
    }

    public void meter(String[] cont) {
        this.cont = cont;
    }
   
    
}
