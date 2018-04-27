/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contenedor;

/**
 *
 * @author ruben
 */
public class HiloMeter implements Runnable{
    private String[] dato;
    private int pos;
    private String ndato;
    

    public HiloMeter(String[] dato,int pos,String ndato) {
        this.dato = dato;
        this.pos = pos;
        this.ndato=ndato;
    }  
    public void run() {
        System.out.println("Se ingresó el dato: "+ndato+" "+ "en la posicion: "+pos);
        dato[pos]=ndato;
    }
    
}
