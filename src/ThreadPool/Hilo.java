/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThreadPool;

/**
 *
 * @author ruben
 */
public class Hilo implements Runnable{
private int id;

public Hilo(){}

public Hilo(int id){
    this.id = id;
}
    @Override
    public void run() {
        System.out.println("Ejecutando el hilo: " + getId());
        for(int i=0;i<100;i++){
            System.out.println(i);
        }
        System.out.println("Se acabó el hilo: "+getId());
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
}
