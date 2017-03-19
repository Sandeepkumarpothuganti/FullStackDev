/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overridingdemo;


public class Square extends Shape {

    private int side;

    public Square() {
        side = 10;
    }

    @Override
    public void draw() {
        System.out.println("Im in draw of Square class");
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public Square getInstance() {
        return new Square(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void method1() {
        System.out.println(""); //To change body of generated methods, choose Tools | Templates.
    }

}
