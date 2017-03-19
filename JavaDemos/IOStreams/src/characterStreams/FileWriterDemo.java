/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package characterStreams;

import iostreams.*;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class FileWriterDemo {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        FileWriter fw = new FileWriter("D:\\\\fw.txt");
        fw.write("FileWriter");
        fw.flush();
        fw.close();
    }
}
