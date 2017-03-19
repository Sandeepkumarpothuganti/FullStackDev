/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serialization;

import inheritance.C1;
import inheritance.StudentPerson;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


public class SerializationDemo {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        StudentPerson st = new StudentPerson(10, "Ramu", "St.Anns", "Hyd");
        Student st1 = new Student(10, "Ramu", "St.Anns", "Hyd");
        C1 c1 = new C1(st, st1);
        System.out.println(c1);

        FileOutputStream fos = new FileOutputStream("D:\\student.txt");
        ObjectOutputStream Objos = new ObjectOutputStream(fos);
        Objos.writeObject(c1);//Writing the object of student to the stream
        Objos.flush();
        fos.flush();
        Objos.close();
        fos.close();

    }
}
