/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package superdemo;


public class Parent {

    int defaultInteger;
    private int privateInterger;
    protected int protectedInteger;

    public Parent() {
        defaultInteger = 10;
        privateInterger = 10;
        protectedInteger = 10;
        System.out.println("Im in default const of PARENT class");
    }

    public Parent(int def, int pri, int pro) {
        defaultInteger = def;
        privateInterger = pri;
        protectedInteger = pro;
        System.out.println("Im in parameterised const of PARENT class");
    }

    int getDefaultInteger() {
        return defaultInteger;
    }

    private int getPrivateInteger() {
        return privateInterger;
    }

    protected int getprotectedInteger() {
        return protectedInteger;
    }

}
