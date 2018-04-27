/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semaforos;
import java.util.concurrent.*;

/**
 *
 * @author ruben
 */
public class Semaforo {
    public static void main(String args[]){
        
        Semaphore sem = new Semaphore(3,true);
        
        Carro c1 = new Carro("Toyota",sem);
        Carro c2 = new Carro("Kia",sem);
        Carro c3 = new Carro("Nissan",sem);
        Carro c4 = new Carro("Mercedes",sem);
        Carro c5 = new Carro("Chevrolet",sem);
        Carro c6 = new Carro("Honda",sem);
        Carro c7 = new Carro("Mazda",sem);
        
        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(c2);
        Thread t3 = new Thread(c3);
        Thread t4 = new Thread(c4);
        Thread t5 = new Thread(c5); 
        Thread t6 = new Thread(c6);
        Thread t7 = new Thread(c7);
        
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
        
    }
}
