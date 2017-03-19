/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examples;

import java.util.logging.Level;
import java.util.logging.Logger;


public class ThreadDemo1 extends Thread {

    int str;

    public ThreadDemo1(int str) {
        this.str = str;
    }

    @Override
    public void run() {
        System.out.println("Im in Thread");
        if (str == 1) {
            method1();
        } else {
            method2();
        }
    }

    private void method1() {
        for (int i = 0; i < 10; i++) {
            try {
                System.out.println(Thread.currentThread().getName() + "pass1-m1()");
                Thread.sleep(100);
            } catch (Exception ex) {
                Logger.getLogger(ThreadDemo1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        Thread.yield();
        for (int i = 0; i < 10; i++) {
            try {
                System.out.println(Thread.currentThread().getName() + "pass2 - m1()");
                Thread.sleep(100);
            } catch (Exception ex) {
                Logger.getLogger(ThreadDemo1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private void method2() {
        for (int i = 0; i < 1000; i++) {
            try {
                System.out.println("m2()");
//                Thread.sleep(10);
            } catch (Exception ex) {
                Logger.getLogger(ThreadDemo1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
