/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorypatterndemo;


public class ShapeFactory {

    public static Shape getShape(String nameOfShape) {
        if (nameOfShape.equalsIgnoreCase("Rectangle")) {
            return new Rectangle();
        } else if (nameOfShape.equalsIgnoreCase("square")) {
            return new Square();
        } else if (nameOfShape.equalsIgnoreCase("circle")) {
            return new Circle();
        }
        return null;
    }
}
