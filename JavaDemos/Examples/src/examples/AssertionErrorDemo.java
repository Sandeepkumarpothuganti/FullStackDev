/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examples;


public class AssertionErrorDemo {

    public static void method(int x) {
        assert x > 0;
        System.out.println("x is postive");
    }

    public static void method1(int x) {
        assert x > 0 : "x is negative";

        System.out.println("x is postive");
    }

    public static void main(String[] args) {
        method(10);
        method1(-1);
    }
}
