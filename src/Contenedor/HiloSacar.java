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
public class HiloSacar implements Runnable{
    String[] datos;
    int pos;

    public HiloSacar(String[] datos, int pos) {
        this.datos = datos;
        this.pos = pos;
    }
    public void run() {
       System.out.println("se sacó el dato: " + datos[pos]);
       datos[pos] = null;
    }
    
}
