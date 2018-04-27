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

/**
 *Ubaldo Pánuco Sandoval
 * Chat 
 * Chat impementado en consola mediante el uso del protocolo TCP
 * 13/04/2018
 */
public class Enviar implements Runnable {
    Socket clientSocket;

    public Enviar(Socket c) {
        clientSocket = c;
    }   
  public void run(){
      try{
    PrintWriter out =  new PrintWriter(clientSocket.getOutputStream(), true);
			
            BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));
            String userInput;
            
            System.out.print(">"); 
            while ((userInput = stdIn.readLine()) != null) {
		out.println(userInput);
                System.out.println("Mensaje enviado al serv: " + userInput);
                System.out.print(">"); 
            }
            clientSocket.close();
            System.out.println("conexion terminada!");
	}
        catch (IOException e) { e.printStackTrace(); }
  }
}
