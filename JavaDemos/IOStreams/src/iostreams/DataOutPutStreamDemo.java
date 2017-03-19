/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iostreams;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class DataOutPutStreamDemo {

    public static void main(String[] args) throws FileNotFoundException {
        DataOutputStream dos = null;
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("D:\\\\DataInputStream.txt");
            dos = new DataOutputStream(fos);
            dos.writeInt(10);
            dos.writeInt(20);
            dos.writeInt(30);
            dos.writeInt(40);
            dos.writeInt(50);
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            try {
                dos.flush();
                dos.close();
                fos.flush();
                fos.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}
