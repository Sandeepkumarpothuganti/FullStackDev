/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class FileOutputStreamDemo {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileOutputStream fos = new FileOutputStream("D:\\\\testout.txt");
        String s = "Welcome to javaTpoint.";
        byte b[] = s.getBytes();//converting string into byte array    
        fos.write(b);
        fos.flush();
        fos.close();

        FileInputStream fis = new FileInputStream("D:\\\\testout.txt");
        int i = fis.read();
        System.out.println((char) i);
        fis.close();
    }
}
