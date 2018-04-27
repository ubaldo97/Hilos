/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contador;

/**
 *
 * @author ruben
 */
public class Test {
    public static void main(String args[]){
        Contador c = new Contador();
        Terminal t1 = new Terminal("Terminal 1",c);
        Terminal t2 = new Terminal("Terminal 2",c);
        t1.start();
        t2.start();
    }
}
