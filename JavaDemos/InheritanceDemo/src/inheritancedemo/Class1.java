/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritancedemo;

import pkg1.PrivateClass;
import pkg1.PublicClass;


public class Class1 {

    public Class1() {
        super();
        ////
        ////
        ///
    }

    static char c;

    public void method1() {
        System.out.println("Im in m1() of class1");
    }

    protected void method() {
        System.out.println("Im in m() of class1");
    }

    public void display() {
        System.out.println("Im in display of class1");
    }

    public int getSum(int a, int b) {
        return a + b;
    }

    public Class1 getInstance() {
        return new Class1();
    }

    public static void main(String[] args) {
        System.out.println("" + c);
    }
}
