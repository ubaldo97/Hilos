/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SocketTCPHilos2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *Ubaldo Pánuco Sandoval
 * Chat 
 * Chat impementado en consola mediante el uso del protocolo TCP
 * 13/04/2018
 */
public class EjecutaServidor implements Runnable{
    private Socket client;

    EjecutaServidor(Socket client) {
        this.client = client;
        System.out.println("Conectado a: " + client);
    }

    public void run(){
        
        BufferedReader in = null;
        PrintWriter out = null;
         String en = "";
          String line = "";       
        BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));
        int clientPort = client.getPort(); 
        try{
          in = new BufferedReader(new InputStreamReader(client.getInputStream()));
          out = new PrintWriter(client.getOutputStream(), true);
          while(true){
          while ((en = in.readLine()) != null) {
          System.out.println(en);
            if (en.contains("FinCliente")) {
                break;
            }           
          }
          while((line = stdIn.readLine()) != null){
                
                out.println("Server-->" + clientPort + ">> " + line);
                System.out.println(clientPort + ">> " + line);  
                if(line.contains("FinServidor")){
                break;
                }
            }
          
          }
          
        } catch (IOException e) {
          System.out.println(e.getMessage());
          System.exit(-1);
        }

       
        
        try {
            client.close();
            System.out.println("conexion con: " + client + " terminada!");
        } catch (IOException e) {
            System.out.println("Error en conexion con el cliente: " + client);
        }
    }
}
