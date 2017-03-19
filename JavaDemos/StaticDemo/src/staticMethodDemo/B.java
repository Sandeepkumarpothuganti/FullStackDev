/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staticMethodDemo;


public class B {

    public void callStaticMethod() {
        A.printHello();
        A obj = new A();
        {

        }
    }

    public static void main(String[] args) {
        A.printHello();
        A.printHello();
        A.printHello();
    }
}
