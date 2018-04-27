/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uno;

/**
 *
 * @author ruben
 */
public class ClaseThread extends Thread{
   
    public ClaseThread(String nom){
        super(nom);
    }
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("Hilo "+this.getName()+": "+"Prioridad: "+this.getPriority());
        }
    }
    
}
