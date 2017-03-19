/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streams;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class DataInputStreamDemo {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileInputStream file = new FileInputStream("D:\\testout.txt");
        DataInputStream dis = new DataInputStream(file);
        System.out.println(  dis.readInt());
        System.out.println(  dis.readInt());
        System.out.println(  dis.readInt());
        System.out.println(  dis.readInt());
//        while (dis.available() > 0) {
//            System.out.println((char) dis.read());
//        };
    }
}
