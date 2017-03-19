/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datatypedemo;


public class DataTypeDemo {

    private boolean bool;
    private char c;
    private byte b;
    short s;
    private int i = 6;
    private long l;
    private float f;
    private double d;

//    public int getI() {
//        return i;
//    }
    public int getI() {
        return i;
    }

    public void display() {
        System.out.println("default value of boolean is :" + bool);
        System.out.println("default value of char is :" + c);
        System.out.println("default value of byte is :" + b);
        System.out.println("default value of short is :" + s);
        System.out.println("default value of int is :" + i);
        System.out.println("default value of long is :" + l);
        System.out.println("default value of float is :" + f);
        System.out.println("default value of double is :" + d);
    }

    public static void main(String[] args) {
        DataTypeDemo obj = new DataTypeDemo();
        obj.display();
    }
}
