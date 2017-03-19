/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iostreams;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class BufferOutputStreamDemo {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileOutputStream fos = new FileOutputStream("D:\\\\f3.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        String str = "Demo of Fileoutput stream.";
        byte[] b = str.getBytes();
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            bos.write(b);
        }
        long stop = System.currentTimeMillis();
        System.out.println(stop - start);
        bos.flush();
        fos.flush();
        bos.close();
        fos.close();
    }
}
