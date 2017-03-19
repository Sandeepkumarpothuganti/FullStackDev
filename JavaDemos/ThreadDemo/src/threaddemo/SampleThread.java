/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threaddemo;


public class SampleThread implements Runnable {

    private int i;

    public SampleThread(int i) {
        this.i = i;
    }

    @Override
    public void run() {
        if (i == 1) {
            fun1();
        } else {
            fun2();
        }
    }

    public void fun1() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + " Pass1-->In fun1()");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
            }
        }

        Thread.yield();

        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + " Pass2-->In fun1()");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
            }
        }
    }

    public void fun2() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("In fun2()");
            try {
                Thread.sleep(5);
            } catch (InterruptedException ex) {
            }
        }
    }
}
