/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SocketsHilosTCP;

import java.io.*;
import java.net.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author ubaldo
 */
public class Cliente extends Conexion implements Runnable{
    String op="";
    String op2="";
     public Cliente() throws IOException{
         super("cliente");
     }
     
        public static void main(String args[]) throws IOException{
            Cliente cli = new Cliente();
            //cli.iniciarCliente();
             Thread h1 = new Thread(cli); 
             h1.start();
            
             
    }
        
         public void Enviar(){
         try {
             System.out.println("Escriba su mensaje: ");
             Scanner s = new Scanner(System.in);
             op = s.nextLine();
                salidaServidor= new DataOutputStream(cs.getOutputStream());    
                salidaServidor.writeUTF(op);
                System.out.println();
         }catch(IOException ex){
             System.out.println(ex.getMessage());
         }
     }
     public void Recibir(){
         try {
        InputStream is = cs.getInputStream();
               DataInputStream entrada = new DataInputStream(is);
               op2=entrada.readUTF();
                System.out.println(op2);
         }catch(IOException ex){
             System.out.println(ex.getMessage());
         }
     } 
     
     public void run(){
        try {
            while(!(op.equals("Adios"))){
               Enviar();
               if(!(op.equals("Adios"))){
                    Recibir();
                    if(op2.equals("Adios")){
                        break;
                    }
               }else{
                  break;
               }
            }
                cs.close();                               
        } catch (IOException ex) {
                System.out.println(ex.getMessage());
            } 
     
     }
        
}
