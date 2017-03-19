/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2;

public class A {

    private int data;

    A() {
        System.out.println("Im in A");
        B objB = new B(this);
        objB.display();
    }

    public int getData() {
        return data;
    }

    public A getInstance() {
        return this;
    }

    public static void main(String args[]) {
        A a = new A();
        A a1 = a.getInstance();
        System.out.println(a);
        System.out.println(a1);
    }
}
