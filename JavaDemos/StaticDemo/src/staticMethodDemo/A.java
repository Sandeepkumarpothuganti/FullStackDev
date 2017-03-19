/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staticMethodDemo;


public class A {

    private int nonStaticVariable;
    private static int staticVariable;

    public static void printHello() {
        method1();        
        System.out.println("Hello");
    }

    public void printNonStaticWord() {
        method1();
        printHello();
        int temp = nonStaticVariable;
        int temp1 = staticVariable;
        System.out.println("NonStaticWord");
    }

    public static void method1() {
        System.out.println("Static method 2");
    }

    public static void main(String[] args) {
        A obj = new A();
    }
}
