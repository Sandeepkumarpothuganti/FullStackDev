/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorypatterndemo;


public class ShapeFactoryDemo {

    public static void main(String[] args) {
        Shape rectangle = ShapeFactory.getShape("Rectangle");
        rectangle.draw();
        Shape square = ShapeFactory.getShape("square");
        square.draw();
        Shape circle = ShapeFactory.getShape("circle");
        circle.draw();
    }
}
