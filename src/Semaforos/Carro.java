/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semaforos;
import java.util.concurrent.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author ruben
 */
public class Carro implements Runnable {
    private String marca;
    private Semaphore s;
    
    public Carro(String m, Semaphore sem){
        marca=m;
        s = sem;
    }

    @Override
    public void run() {
        try {
            s.acquire();// como wait
            System.out.println(marca + "Tiene luz verde");
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
           System.out.println("El semáforo falló pida ayuda a un agente de tránsito "+ex.getMessage());
        }finally{
            s.release();// como notify
        }
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
}
