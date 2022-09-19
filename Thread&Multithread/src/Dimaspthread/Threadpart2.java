/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dimaspthread;

/**
 *
 * @author USER
 */
public class Threadpart2 {
    public static void main (String [] args) {
    Celana celana1 = new Celana("Celana-1");
    Celana celana2 = new Celana("Celana-2");
    celana1.start();
    celana2.start();
    }
}
    class Celana extends Thread {
        // konstruktor
        public Celana (String id) {
            super (id);
        }
        // Mendefinisikan sendiri run()
    @Override
    public void run() {
        String nama = getName();
        for (int i=0; i<5; i++) {
            try {
                sleep(1000); // Tunggu 1 detik
}
            catch(InterruptedException ie) {
                System.out.println("Terinterupsi");
            }
            System.out.println("Thread " + nama + ":Posisi" + i );
        }
}}

