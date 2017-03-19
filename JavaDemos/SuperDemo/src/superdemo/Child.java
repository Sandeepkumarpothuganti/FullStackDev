/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package superdemo;


public class Child extends Parent {

    private int privateInterger;

    public Child() {
        super(10, 20, 30);
        System.out.println("Im in default const of child class");
    }

    public Child(int def, int pri, int pro) {
        super();
        System.out.println("Im in parameterised const of child class");
    }

    public static void main(String[] args) {
        Child obj = new Child(10, 20, 30);
    }
}
