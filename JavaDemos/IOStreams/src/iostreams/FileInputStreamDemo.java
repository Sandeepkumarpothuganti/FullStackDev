/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iostreams;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class FileInputStreamDemo {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        byte[] b = new byte[8192];
        FileInputStream fis = new FileInputStream("D:\\\\f1.txt");
//        fis.read(b);
//        System.out.println(new String(b));
        BufferedInputStream bis = new BufferedInputStream(fis);
        System.out.println("" + bis.available());
        bis.read(new byte[8192], 0, 8191);
        int ch = fis.read();
        while (ch != -1) {
            System.out.print((char) ch);
            ch = fis.read();
        }
        fis.close();
    }
}
