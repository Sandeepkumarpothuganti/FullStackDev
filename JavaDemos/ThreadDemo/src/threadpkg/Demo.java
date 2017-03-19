/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadpkg;


public class Demo {

    public static void main(String[] args) {
        Thread t1 = new MyThread();
        t1.setName("Sandeep");

        Thread t2 = new MyThread();
        t2.setName("Vishnu");

        Thread t3 = new MyThread();
        t3.setName("Venkatesh babu");

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();
        t3.start();

//        System.out.println("Default priority of t1:" + t1.getPriority());
    }
}
