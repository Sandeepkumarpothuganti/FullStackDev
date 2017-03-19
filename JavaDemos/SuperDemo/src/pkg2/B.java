/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2;

public class B {

    private A obj;

    public B(A objA) {
        System.out.println("Im in B, invoked using 'this' from A's cons..");
        obj = objA;
    }

    public void display() {
        System.out.println(obj.getData());
    }
}
