/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serialization;

import inheritance.C1;
import inheritance.StudentPerson;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;


public class DeserializationDemo {

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("D:\\student.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        C1 c1 = (C1) ois.readObject();

        ois.close();
        fis.close();
        System.out.println(c1);
    }
}
