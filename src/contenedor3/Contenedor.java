/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contenedor3;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ruben
 */
public class Contenedor {
    private Object dato[];
    int en = 0;
    int sal = 0;
    int contador=0;
    int tam;

    public Contenedor(int tam) {
        this.tam = tam;
        dato = new Object[tam];
    }
    
      public synchronized void poner(Object valor){
          
           while(contador == tam){
               try {
                   wait();
                   
               } catch (InterruptedException ex) {
                   Logger.getLogger(Contenedor.class.getName()).log(Level.SEVERE, null, ex);
               }
           }
                   dato[en] = valor;
                   contador++;
                   en = (en+1)%tam;
                   notifyAll();
                   
                    for(int i=0;i<tam;i++){
                     System.out.println(dato[i]);
                    }
        
    }
      public synchronized Object sacar(){
          Object valor;
          while(contador==0){
              try {
                  wait();
                  
              } catch (InterruptedException ex) {
                  Logger.getLogger(Contenedor.class.getName()).log(Level.SEVERE, null, ex);
              }
          }
          valor = dato[sal];
          dato[sal]=null; 
          contador--;
          sal = (sal+1)%tam;
      notifyAll();  
     
        return valor;    
      }
      
    
}
