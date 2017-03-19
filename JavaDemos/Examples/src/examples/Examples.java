/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examples;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Examples {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InValidException {
        String str = "10.0";
//        int i = Integer.parseInt(str);
        String str1 = null;
        str1.charAt(0);
        BufferedReader br = null;
        try {
            br.close();
        } catch (IOException ex) {
            Logger.getLogger(Examples.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            int x = 10;
            if (x < 1) {
                throw new InValidException(x + " is Invalid number!!");
//            throw new InValidException(x + " is Invalid number!!");
            }
            br = new BufferedReader(new FileReader(new File("D:\\2.txt")));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Examples.class.getName()).log(Level.SEVERE, null, ex);
        } finally {

        }
    }

}
