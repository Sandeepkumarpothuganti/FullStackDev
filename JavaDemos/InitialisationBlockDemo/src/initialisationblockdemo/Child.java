/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package initialisationblockdemo;


public class Child extends Parent {

    public Child() {
        super();
        System.out.println("Im in a def const of child class.");
    }

    {
        System.out.println("Im in a IIB block1 of child class.");
    }

    public static void main(String[] args) {
        new Child();
    }
}
