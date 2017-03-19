/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package characterStreams;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class BufferedWriterDemo {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        FileWriter fw = new FileWriter("D:\\\\bw.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter pw = new PrintWriter(fw);
        bw.write("BufferWriter");
        bw.newLine();
        bw.write("2nd line");
        bw.flush();
        fw.flush();
        bw.close();
        fw.close();
    }
}
