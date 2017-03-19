/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examples;

import java.util.logging.Level;
import java.util.logging.Logger;


public class ThreadDemo implements Runnable {

    int str;

    public ThreadDemo(int str) {
        this.str = str;
    }

    @Override
    public void run() {
        if (str == 1) {
            method1();
        } else {
            method2();
        }
    }

    private void method1() {
        for (int i = 0; i < 1000; i++) {
            try {
                System.out.println("m1()");
//                Thread.sleep(10);
            } catch (Exception ex) {
                Logger.getLogger(ThreadDemo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private void method2() {
        for (int i = 0; i < 1000; i++) {
            try {
                System.out.println("m2()");
//                Thread.sleep(10);
            } catch (Exception ex) {
                Logger.getLogger(ThreadDemo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
