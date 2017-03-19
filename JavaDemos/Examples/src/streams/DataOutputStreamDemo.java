/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streams;

import java.io.*;

public class DataOutputStreamDemo {

    public static void main(String[] args) throws IOException {
        FileOutputStream file = new FileOutputStream("D:\\testout.txt");
        DataOutputStream data = new DataOutputStream(file);
        data.writeInt(10);
        data.writeInt(20);
        data.writeInt(30);
        data.writeInt(40);
        data.flush();
        data.close();
        System.out.println("Succcess...");
    }
}
