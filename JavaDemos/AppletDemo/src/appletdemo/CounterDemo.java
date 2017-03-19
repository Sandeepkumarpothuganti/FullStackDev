/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appletdemo;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.util.logging.Level;
import java.util.logging.Logger;


public class CounterDemo extends Applet implements
        Runnable {

    private int counter1 = 0;
    private int counter2 = 0;

    @Override
    public void run() {
        while (true) {
            try {
                if (Thread.currentThread().getName().equalsIgnoreCase("t1")) {
                    counter1++;
                    Thread.sleep(1000);
                } else {
                    counter2 += 2;
                    Thread.sleep(2000);
                }

                repaint();

            } catch (InterruptedException ex) {
                Logger.getLogger(CounterDemo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public void init() {
        setBackground(Color.green);
    }

    @Override
    public void start() {

        Thread t1 = new Thread(this);
        t1.start();
        t1.setName("t1");
        Thread t2 = new Thread(this);
        t2.start();
        t2.setName("t2");
    }

    @Override
    public void paint(Graphics g) {
        g.drawString(" t1 Counter:" + counter1, 10, 10);
        g.drawString(" t2 Counter:" + counter2, 20, 20);
    }

    @Override
    public void stop() {
    }

    @Override
    public void destroy() {
    }

}
