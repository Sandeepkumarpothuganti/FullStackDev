/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overridingdemo;


public class Circle extends Shape {

    private static final double pi = 3.14;

    private int radius;

    public Circle() {
        radius = 7;
    }

    @Override
    public void draw() {
        System.out.println("Im in draw of Circle class");
    }

    @Override
    public double getArea() {
        return pi * radius * radius;
    }
}
