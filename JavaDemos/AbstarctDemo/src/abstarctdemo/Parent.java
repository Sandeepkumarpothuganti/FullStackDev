/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstarctdemo;


public abstract class Parent {

    public Parent() {
        System.out.println("Const of Parent");
    }

    public void display() {
        System.out.println("im in display of parent");
    }

    public abstract void absmethod1();

    public abstract void absmethod2();
}
