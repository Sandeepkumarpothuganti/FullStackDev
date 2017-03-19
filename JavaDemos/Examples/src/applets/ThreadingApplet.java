/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package applets;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ThreadingApplet extends Applet implements Runnable {

    private int counter = 0;

    @Override
    public void run() {
        while (true) {
            counter++;
            repaint();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(ThreadingApplet.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public void init() {
        setBackground(Color.green);
    }

    @Override
    public void start() {
        Thread t = new Thread(this);
        t.start();
    }

    @Override
    public void paint(Graphics g) {
        g.drawString("Counter: " + counter, 10, 20);
    }

}
