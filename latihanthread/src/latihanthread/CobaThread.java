/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanthread;

import static java.lang.Thread.sleep;

/**
 *
 * @author USER
 */
public class CobaThread {
    public static void main(String[] args) {
        //TODO code application logic here
        Thread Celana1 = new Thread(new Celana("Celana-1"));
        Thread Celana2 = new Thread(new Celana("Celana-2"));
        
        Celana1.start();
        Celana2.start();
    }
}

class Celana implements Runnable {
    String nama;
    public Celana(String id) {
        nama = id;
    }



    public void run() {
        for (int i=0; i<5; i++) {
            try {
                Thread.currentThread().sleep(1000);
        } catch (InterruptedException ie) {
            System.out.println("Terinterupsi");
        }
        System.out.println("Thread " + nama + " : Posisi" + i);
        }
    }
}
