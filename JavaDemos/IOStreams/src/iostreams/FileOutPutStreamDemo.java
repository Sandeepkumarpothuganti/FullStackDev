/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iostreams;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class FileOutPutStreamDemo {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileOutputStream fos = new FileOutputStream("D:\\\\f4.txt");
        String str = "Demo of Fileoutput stream.";
        byte[] b = str.getBytes();
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            fos.write(b);
        }
        long stop = System.currentTimeMillis();
        System.out.println(stop - start);
        fos.flush();
        fos.close();
    }
}
