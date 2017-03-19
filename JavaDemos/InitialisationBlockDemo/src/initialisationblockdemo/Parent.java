/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package initialisationblockdemo;


public class Parent {

    {
        System.out.println("Im in a IIB block2 of Parent class.");
    }

    public Parent() {
        super();
        System.out.println("Im in a def const of parent class.");
    }

    {
        System.out.println("Im in a IIB block1 of Parent class.");
    }

}
