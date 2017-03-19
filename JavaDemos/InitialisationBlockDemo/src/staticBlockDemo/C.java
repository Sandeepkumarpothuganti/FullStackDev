/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staticBlockDemo;


public class C extends B {

    static {
        System.out.println("Static block of C");
    }

    {
        System.out.println("IIB of C");
    }

    public static void main(String[] args) {
        new C();
        new B();
    }
}
