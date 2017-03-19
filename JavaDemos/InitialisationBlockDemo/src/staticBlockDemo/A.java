/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staticBlockDemo;


public class A {

    static {
        System.out.println("Static block of A");
    }

    {
        System.out.println("IIB of A");
    }
}
