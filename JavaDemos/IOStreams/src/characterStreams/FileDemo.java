/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package characterStreams;

import java.io.File;
import java.io.IOException;


public class FileDemo extends Object {

    public static void main(String[] args) throws IOException {
        File file = new File("D:\\\\filedemo.txt");
//        boolean isFileCreated = file.createNewFile();
//        System.out.println(isFileCreated);
        System.out.println(file.exists());
        File dir = new File("D:\\\\A\\B\\C\\D");
        dir.mkdirs();
        File oneTxt = new File("D:\\\\A\\B\\C\\D\\1.txt");
        oneTxt.delete();
//        oneTxt.createNewFile();
//        String[] list = dir.list();
//        System.out.println(list);
//        for (int i = 0; i < list.length; i++) {
//            System.out.println(list[i]);
//        }

    }
}
