/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrera;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author ruben
 */
public class carrera extends JFrame {
    private Tortuga t1,t2,t3,t4;
    private JLabel l1,l2,l3,l4;
    private JButton iniciar;
    private JPanel p1,p2,p3,p4,p5;
    
    public carrera(){
                this.setTitle("CARRERA DE TORTUGAS");
                this.setLayout(new GridLayout(0,1));
        ImageIcon ic = new ImageIcon("tortuga3.gif");
        ImageIcon ic2 = new ImageIcon("tortuga3.gif");
        ImageIcon ic3 = new ImageIcon("tortuga3.gif");
        ImageIcon ic4 = new ImageIcon("tortuga3.gif");
        l1=new JLabel(ic);
        l2=new JLabel(ic2);
        l3=new JLabel(ic3);
        l4=new JLabel(ic4); 
        
        t1 = new Tortuga("Donatello",400,l1);
        t2 = new Tortuga("Rafael",400,l2);
        t3 = new Tortuga("Miguel Angel",400,l3);
        t4 = new Tortuga("Leonardo",400,l4);
        iniciar = new JButton("Iniciar");
        
        p1 = new JPanel();
        p1.add(l1);
        p2 = new JPanel();
        p2.add(l2);
        p3 = new JPanel();
        p3.add(l3);
        p4 = new JPanel();
        p4.add(l4);
        p5 = new JPanel();
        p5.add(iniciar);
        iniciar.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
            Thread h1 = new Thread(t1);
            Thread h2 = new Thread(t2);
            Thread h3 = new Thread(t3);
            Thread h4 = new Thread(t4);
            
            h1.start();
            h2.start();
            h3.start();
            h4.start();
            }
        });
        
        this.add(p1);
        this.add(p2);
        this.add(p3);
        this.add(p4);
        this.add(p5);
       
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLocation(500,150);
        this.setVisible(true);
    }
    
    
    public static void main(String args[]){
        
        
        carrera c = new carrera();
        c.setVisible(true);
//        Tortuga t1 = new Tortuga("Donatello",100);
//        Tortuga t2 = new Tortuga("Rafael",100);
//        Tortuga t3 = new Tortuga("Miguel Angel",100);
//        Tortuga t4 = new Tortuga("Leonardo",100);
//        
//        Thread h1 = new Thread(t1);
//        Thread h2 = new Thread(t2);
//        Thread h3 = new Thread(t3);
//        Thread h4 = new Thread(t4);
//        
//        h1.start();
//        h2.start();
//        h3.start();
//        h4.start();
        
        
    }
}
