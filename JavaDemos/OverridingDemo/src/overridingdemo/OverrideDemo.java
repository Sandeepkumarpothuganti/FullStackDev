/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overridingdemo;


public class OverrideDemo {

    public static void main(String[] args) {
        Shape rectShape = new Rectangle();
        System.out.println("Area of Rectangle:" + rectShape.getArea());
        Shape squareShape = new Square();
        System.out.println("Area of Square:" + squareShape.getArea());
        Shape circle = new Circle();
        System.out.println("Area of circle:" + circle.getArea());
    }
}
