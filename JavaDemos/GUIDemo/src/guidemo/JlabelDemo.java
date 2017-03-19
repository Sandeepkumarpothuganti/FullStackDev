/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guidemo;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class JlabelDemo {

    public static void main(String[] args) {
        JLabel lbl = new JLabel("Hello");
        JPanel panel = new JPanel();
        JFrame frame = new JFrame("Label demo");
        panel.add(lbl);
        frame.add(panel);

        frame.setSize(200, 200);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
