/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appletdemo;

import java.applet.Applet;
import java.awt.Graphics;


public class LifeCycleDemo extends Applet {

    @Override
    public void init() {
        System.out.println("init()");
    }

    @Override
    public void start() {
        System.out.println("Start");
    }

    @Override
    public void paint(Graphics g) {
        System.out.println("paint");
        g.drawString("Welcome to applet", 10, 10);
    }

    @Override
    public void stop() {
        System.out.println("stop");
    }

    @Override
    public void destroy() {
        System.out.println("destroy");
    }
}
