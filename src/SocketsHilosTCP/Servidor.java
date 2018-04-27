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
public class Servidor extends Conexion implements Runnable {
    String op="",op2="";
    public Servidor() throws IOException{
        super("servidor");
        cs = ss.accept();
    }
    
    public static void main(String args[]) throws IOException{
         Servidor serv = new Servidor();
        
           Thread h1 = new Thread(serv); 
           h1.start();
        
          
    }
    public void Enviar(){
        try {
            System.out.println("Escriba su respuesta: ");            
            Scanner s = new Scanner(System.in);
            op = s.nextLine();
            salidaCliente = new DataOutputStream(cs.getOutputStream());
            salidaCliente.writeUTF(op);
            System.out.println();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
     public void Recibir(){
        try {
                InputStream is = cs.getInputStream();
                DataInputStream entrada = new DataInputStream(is);
                op2 = entrada.readUTF();
                System.out.println(op2);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void run() {
       try {
           while(!(op2.equals("Adios"))){
                Recibir();
                if(!(op2.equals("Adios"))){
                    Enviar();
                    if((op.equals("Adios"))){
                         break;
                    }
                }else{break;}      
            }         
            ss.close();
            cs.close();
            
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
