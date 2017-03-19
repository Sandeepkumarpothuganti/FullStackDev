/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iostreams;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class DataInputStreamDemo {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileInputStream fis = new FileInputStream("D:\\\\DataInputStream.txt");
        DataInputStream dis = new DataInputStream(fis);
        System.out.println(dis.readInt());
        System.out.println(dis.readInt());
        System.out.println(dis.readInt());
        System.out.println(dis.readInt());
        System.out.println(dis.readInt());
        dis.close();
        fis.close();
    }
}
