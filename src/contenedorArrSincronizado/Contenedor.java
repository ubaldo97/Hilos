/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contenedorArrSincronizado;


import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ruben
 */
public class Contenedor {
    private int[] dato;
    private int pos=0;
    private boolean[] hayDato;
    
    public Contenedor(){
        dato = new int[10];
        hayDato = new boolean[10];
        for(int i=0;i<10;i++){
            hayDato[i]=false;           
        }
    }
    
    public synchronized int sacar(){
         if(pos<=0){
        while(hayDato[0] == false){
            try {
                wait();
             } catch (InterruptedException ex) {
               System.out.println(ex.getMessage());
            }
            }
        }
        hayDato[pos] = false;
        if(pos>0){
        pos--;}
        notifyAll();
        return dato[pos];
    }
    public synchronized void poner(int valor){
        if(pos>=10){
        while(hayDato[9]==true){          
            try {   
                wait();
            } catch (InterruptedException ex) {
                System.out.println(ex.getMessage());
            }
            }
        }
        dato[pos] = valor;
        hayDato[pos]=true;        
        pos++; 
//         for(int i=0;i<10;i++){
//     System.out.println(dato[i]);
//     }
         System.out.println();
        notifyAll();
    }
    
 
}
