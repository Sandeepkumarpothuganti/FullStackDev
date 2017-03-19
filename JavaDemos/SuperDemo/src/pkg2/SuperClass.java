/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2;


public class SuperClass {

    public SuperClass() {
    }

    public SuperClass(int i) {
        System.out.println("Im in para const of SuperClass....");
    }

    public SuperClass(char i) {
        this(10);
        System.out.println("Im in para const of SuperClass....");
    }
}
