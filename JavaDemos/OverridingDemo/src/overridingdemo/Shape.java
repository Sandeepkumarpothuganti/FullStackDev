/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overridingdemo;


public class Shape {

    public void draw() {
        System.out.println("Im in draw of Shape class");
    }

    public double getArea() {
        return 0;
    }

    protected Shape getInstance() {
        return new Shape();
    }

    public static void display() {
        System.out.println("Display");
    }

    public void method1() throws Exception {
        System.out.println("");
    }
}
