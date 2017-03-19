/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringbufferdemo;


public class BufferVsBuilder {

    public static void string() {
        String sb = new String("Hello");
        for (int i = 0; i < 20000; i++) {
            sb = sb + "" + i;
        }
    }

    public static void stringBuffer() {
        StringBuffer sb = new StringBuffer("Hello");
        for (int i = 0; i < 20000; i++) {
            sb.append(i);
        }
    }

    public static void stringBuilder() {
        StringBuilder sb = new StringBuilder("Hello");
        for (int i = 0; i < 20000; i++) {
            sb.append(i);
        }
    }

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        string();
        long endTime = System.currentTimeMillis();
        System.out.println("Time using String:" + (endTime - startTime) + "ms");

        startTime = System.currentTimeMillis();
        stringBuilder();
        endTime = System.currentTimeMillis();
        System.out.println("Time using StringBuffer:" + (endTime - startTime) + "ms");

//        startTime = System.currentTimeMillis();
//        stringBuilder();
//        endTime = System.currentTimeMillis();
//        System.out.println("Time using StringBuilder:" + (endTime - startTime) + "ms");
    }

}
