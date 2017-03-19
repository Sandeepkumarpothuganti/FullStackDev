/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threaddemo;

import java.util.logging.Level;
import java.util.logging.Logger;


public class ThreadDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Runnable r1 = new SampleThread(1);
        Thread t1 = new Thread(r1);
        t1.setName("fun1");

        Runnable r2 = new SampleThread(1);
        Thread t2 = new Thread(r2);
        t2.setName("fun2");

        t1.setPriority(8);
        t2.setPriority(8);

        t1.start();
        t2.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("main():" + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                Logger.getLogger(ThreadDemo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        System.out.println("Im exiting main thread.");
    }

}
