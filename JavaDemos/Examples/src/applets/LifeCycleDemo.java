/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package applets;

import java.applet.Applet;
import java.awt.Graphics;

public class LifeCycleDemo extends Applet {

    @Override
    public void init() {
        System.out.println("Im in init()");
    }

    @Override
    public void paint(Graphics g) {
        System.out.println("in paint()");
        g.drawString("Hello", 100, 200);
        g.fillArc(100, 100, 100, 100, 0, 45);
        g.fillRect(20, 20, 100, 200);
    }

    @Override
    public void destroy() {
        System.out.println("Destroy");
    }
}
