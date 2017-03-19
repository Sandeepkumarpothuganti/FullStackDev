/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionhandling;

import java.io.File;
import java.io.IOException;


public class Sample {

    public static void main(String[] args) {
        System.out.println("Line1");
        System.out.println("Line2");
        System.out.println("Line3");
        System.out.println("Line4");
        System.out.println("Line5");
        int x = 10;
        try {
            int y = x / 0;
            File f = new File("E:\\1.txt");
            f.createNewFile();
        } catch (ArithmeticException ex) {
            //code for handling the ArithmeticException
            System.out.println("Division by zero.Handle it properly.");
        } catch (IOException ex) {
            //Code to handle IOException
            System.out.println("File not found");
        }
        System.out.println("");

        System.out.println("Line6");
        System.out.println("Line7");
        System.out.println("Line8");
        System.out.println("Line9");
        System.out.println("Line10");
    }

}
