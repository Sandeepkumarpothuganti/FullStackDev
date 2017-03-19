/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iostreams;

import java.io.*;

public class ByteArrayOutputStreamDemo {

    public static void main(String args[]) throws Exception {
        FileOutputStream fout1 = new FileOutputStream("D:\\t1.txt");
        FileOutputStream fout2 = new FileOutputStream("D:\\t2.txt");
        FileOutputStream fout3 = new FileOutputStream("D:\\t3.txt");
        FileOutputStream fout4 = new FileOutputStream("D:\\t4.txt");
        String str = "ByteArray output stream example.";

        ByteArrayOutputStream bout = new ByteArrayOutputStream();
        bout.write(str.getBytes());
        bout.writeTo(fout1);
        bout.writeTo(fout2);
        bout.writeTo(fout3);
        bout.writeTo(fout4);

        bout.flush();
        bout.close();//has no effect    
        System.out.println("Success...");
    }
}
