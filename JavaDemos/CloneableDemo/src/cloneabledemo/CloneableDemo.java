/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cloneabledemo;


public class CloneableDemo implements Cloneable {

    private int data;

    public CloneableDemo() {
        data = 10;
    }

    public void display() {
        System.out.println(data);
    }

    public static void main(String[] args) {
        CloneableDemo obj = new CloneableDemo();
        obj.display();

        CloneableDemo obj1;
        try {
            obj1 = (CloneableDemo) obj.clone();
            obj1.display();
        } catch (CloneNotSupportedException ex) {
            ex.printStackTrace();
        }

    }

}
