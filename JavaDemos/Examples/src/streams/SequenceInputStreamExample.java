/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streams;

import java.io.*;

public class SequenceInputStreamExample {

    public static void main(String args[]) throws Exception {
        FileInputStream input1 = new FileInputStream("D:\\testin.txt");
        FileInputStream input2 = new FileInputStream("D:\\testout.txt");
        SequenceInputStream inst = new SequenceInputStream(input1, input2);
        int j;
        while ((j = inst.read()) != -1) {
            System.out.print((char) j);
        }
        inst.close();
        input1.close();
        input2.close();
    }
}
