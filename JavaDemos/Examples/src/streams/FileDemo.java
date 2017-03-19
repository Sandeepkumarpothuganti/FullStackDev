/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streams;

import java.io.File;
import java.io.IOException;


public class FileDemo {

    public static void main(String[] args) throws IOException {
        File f = new File("D:\\SVKV2\\1.txt");
        f.createNewFile();
        f.delete();
        System.out.println("" + f.list());

    }
}
