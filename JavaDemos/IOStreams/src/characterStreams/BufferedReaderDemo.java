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
import java.io.IOException;


public class BufferedReaderDemo {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        FileReader fr = new FileReader("D:\\\\bw.txt");
        BufferedReader br = new BufferedReader(fr);
        System.out.println(br.readLine());
        System.out.println(br.readLine());
        br.close();
        fr.close();
    }
}
