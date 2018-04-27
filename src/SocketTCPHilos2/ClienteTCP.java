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
import java.net.InetAddress;
import java.net.Socket;

/**
 *Ubaldo Pánuco Sandoval
 * Chat 
 * Chat impementado en consola mediante el uso del protocolo TCP
 * 13/04/2018
 */
public class ClienteTCP {
    public static void main(String[] args) {
	
		
	String hostName = "127.0.0.1";
	int portNumber = 1234;
	try {
            InetAddress address = InetAddress.getByName(hostName);
            Socket clientSocket = new Socket(address, portNumber);
            System.out.println("ENTER para enviar, FinCliente para recibir \n");			
            EjecutaCliente l;
            try {
                l = new EjecutaCliente(clientSocket);
                Enviar l2 = new Enviar(clientSocket);
                Thread t = new Thread(l);
                Thread t2 = new Thread(l2);
                t.start();
                t2.start();
            } catch (Exception e) { System.out.println(e.getMessage()); }

	}
        catch (IOException e) { e.printStackTrace(); }
    }
}
