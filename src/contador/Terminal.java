/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contador;

/**
 *
 * @author ruben
 */
public class Terminal extends Thread {
    private Contador cont;

    public Terminal(String nombre, Contador c) {
        super(nombre);
        this.cont = c;
    }
    public void run(){
        for(int i=0;i<10;i++){
            cont.incrementarContador();
            System.out.println(this.getName()+" : "+cont.getContador());
        }
    }
    
    
    
}
