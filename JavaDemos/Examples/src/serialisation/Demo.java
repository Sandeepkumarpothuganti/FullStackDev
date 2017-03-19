/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serialisation;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;


public class Demo {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        Student st = new Student(10, "SVKV", "Hyd");
        FileOutputStream fout = new FileOutputStream("D:\\Serial.txt");
        ObjectOutputStream oout = new ObjectOutputStream(fout);
        oout.writeObject(st);
        oout.flush();
        fout.flush();
        oout.close();
        fout.close();
    }
}
