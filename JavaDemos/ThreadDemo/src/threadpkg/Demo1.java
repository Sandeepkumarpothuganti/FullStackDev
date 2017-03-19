/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadpkg;


public class Demo1 {

    public static void main(String[] args) {
        Runnable r = new MyRunnable();
       
        Thread t1 = new Thread(r);
        t1.setName("Sandeep");
        t1.start();

        Thread t2 = new Thread(r);
        t2.setName("Vishnu");
        t2.start();

        Thread t3 = new Thread(r);
        t3.setName("Venkatesh babu");
        t3.start();
    }
}
