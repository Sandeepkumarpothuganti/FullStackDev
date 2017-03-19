/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class FinallyDemo {

    public static void main(String[] args) {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(new File("D:\\f1.txt")));
            br.readLine();
        } catch (FileNotFoundException ex) {
//            System.out.println("f1.txt is not present.");
            ex.printStackTrace();
        } catch (IOException ex) {
//            System.out.println("Im in IOException handler");
            ex.printStackTrace();
        } finally {
//            System.out.println("Im in finally");
            try {
                br.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

    }
}
