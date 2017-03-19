/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package applets;

import java.applet.Applet;
import java.awt.Graphics;


public class First extends Applet {

    @Override
    public void paint(Graphics g) {
        g.drawString("welcome", 150, 150);
    }

}
