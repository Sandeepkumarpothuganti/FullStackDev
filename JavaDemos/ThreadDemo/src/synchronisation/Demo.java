/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package synchronisation;


public class Demo {

    public static void main(String[] args) {
        Runnable r = new RaceCondition();

        Thread t1 = new Thread(r);
        t1.setName("Sandeep");
        t1.start();

        Thread t2 = new Thread(r);
        t2.setName("Venkatesh Babu");
        t2.start();

    }
}
