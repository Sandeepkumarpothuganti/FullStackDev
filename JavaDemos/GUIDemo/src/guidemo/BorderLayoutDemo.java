/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guidemo;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class BorderLayoutDemo {

    public static void main(String[] args) {
        JPanel northPanel = new JPanel();
        JPanel southPanel = new JPanel();
        JPanel eastPanel = new JPanel();
        JPanel westPanel = new JPanel();
        JPanel centerPanel = new JPanel();
        JLabel northlbl = new JLabel("North");
        JLabel southlbl = new JLabel("South");
        JLabel centerlbl = new JLabel("Center");
        JLabel eastlbl = new JLabel("East");
        JLabel westlbl = new JLabel("West");
        JPanel mainPanel = new JPanel(new BorderLayout(10, 10));
        JFrame frame = new JFrame("Border Layout");

        northPanel.add(northlbl);
        southPanel.add(southlbl);
        centerPanel.add(centerlbl);
        eastPanel.add(eastlbl);
        westPanel.add(westlbl);
        mainPanel.add(northPanel, BorderLayout.NORTH);
        mainPanel.add(southPanel, BorderLayout.SOUTH);
        mainPanel.add(eastPanel, BorderLayout.EAST);
        mainPanel.add(westPanel, BorderLayout.WEST);
        mainPanel.add(centerPanel, BorderLayout.CENTER);

        frame.add(mainPanel);

        frame.setSize(500, 500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
