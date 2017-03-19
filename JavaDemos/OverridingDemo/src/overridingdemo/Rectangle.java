/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overridingdemo;

import java.io.IOException;


public class Rectangle extends Shape {

    private int length;
    private int breadth;

    public Rectangle() {
        length = 20;
        breadth = 10;
    }

    @Override
    public void draw() {
        System.out.println("Im in draw of Rectangle class");
    }

    @Override
    public double getArea() {
        return length * breadth;
    }

    @Override
    public Rectangle getInstance() {
        return new Rectangle();
    }

    @Override
    public void method1() throws Exception {
    }

}
