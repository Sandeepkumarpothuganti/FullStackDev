/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guidemo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Demo1 {

    public static void main(String[] args) {
        JLabel lbl = new JLabel("Name");
        final JTextField txtField = new JTextField(20);
        JButton btn = new JButton("click");

        ///
        btn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                System.out.println(txtField.getText());
            }
        });

        btn.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("btn is clicked");
            }

            @Override
            public void mousePressed(MouseEvent e) {
                System.out.println("mouse pressed");
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                System.out.println("mouse released");
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                System.out.println("mouse entered");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                System.out.println("mouse exited");
            }
        });

        txtField.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e) {
                System.out.println("btn is clicked");
            }

            @Override
            public void mousePressed(MouseEvent e) {
                System.out.println("mouse pressed");
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                System.out.println("mouse released");
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                System.out.println("mouse entered");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                System.out.println("mouse exited");
            }

        });

        ////
        JPanel panel = new JPanel();
        JFrame frame = new JFrame("Label demo");
        panel.add(lbl);
        panel.add(txtField);
        panel.add(btn);
        frame.add(panel);

        frame.setSize(200, 200);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
