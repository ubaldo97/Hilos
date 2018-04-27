/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SocketTCPHilos2;

import java.io.IOException;
import java.net.ServerSocket;

/**
 *Ubaldo Pánuco Sandoval
 * Chat 
 * Chat impementado en consola mediante el uso del protocolo TCP
 * 13/04/2018
 */
public class ServidorTCP {
    public static void main(String[] args) {
        try{
            ServerSocket server = new ServerSocket(1234);
            System.out.println("Servidor en ejecución, Bye. para terminar, FinServidor para recibir \n");

            while(true){
                EjecutaServidor w;
                try {
                    w = new EjecutaServidor(server.accept());
                    Thread t = new Thread(w);
                    t.start();
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                    System.exit(-1);
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
            System.exit(-1);
        }

        
    }
}
