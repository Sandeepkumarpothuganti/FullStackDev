/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guidemo;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class JButtonDemo {

    public static void main(String[] args) {
        
        
        JButton btn = new JButton("Click me!!");
        JPanel panel = new JPanel();
        JFrame frame = new JFrame("Button demo");

        panel.add(btn);
        frame.add(panel);
        frame.setSize(100, 100);
        frame.setVisible(true);
    }
}
