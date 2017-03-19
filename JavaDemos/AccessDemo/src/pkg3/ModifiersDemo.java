/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3;


public class ModifiersDemo {

    private void privateMethod() {
        System.out.println("Im Private method");
    }

    public void publicMethod() {
        System.out.println("Im public method");
    }

    protected void protectedMethod() {
        System.out.println("Im protected method");
    }

    void defaultMethod() {
        System.out.println("Im default method.");
    }
}
