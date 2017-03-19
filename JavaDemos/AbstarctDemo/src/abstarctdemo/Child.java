/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstarctdemo;


public abstract class Child extends Parent {

    public Child() {
        System.out.println("Const of child");
    }

    @Override
    public void absmethod1() {
        System.out.println("Def for abs method");
    }

    public void method2() {
        System.out.println("method2");
    }
}
