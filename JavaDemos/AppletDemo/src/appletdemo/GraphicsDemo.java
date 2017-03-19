/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appletdemo;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;


public class GraphicsDemo extends Applet {

    @Override
    public void paint(Graphics g) {
        setForeground(Color.red);
        g.drawRect(10, 10, 100, 200);
        g.fillRect(100, 10, 100, 200);
    }

}
