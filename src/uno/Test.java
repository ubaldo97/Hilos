/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uno;

/**
 *
 * @author ruben
 */
public class Test {
    public static void main(String args[]){
        ClaseThread h1 = new ClaseThread("Walter White");
        ClaseThread h2 = new ClaseThread("Jessy Pinkman");
        ClaseThread h3 = new ClaseThread("Gus Fringman");
        h1.setPriority(1);
        h2.setPriority(10);
        h1.start();
        h2.start();
        h3.start();
    }
}
