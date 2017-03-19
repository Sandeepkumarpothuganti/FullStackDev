/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staticdemo;


public class StaticVariableDemo {

    private int i;
    private static int j;

    public StaticVariableDemo(int i1, int j1) {
        this.i = i1;
        this.j = j1;
    }

    public void display() {
        System.out.println(i + "\t" + j);
    }

    public static void main(String[] args) {
        StaticVariableDemo obj1 = new StaticVariableDemo(10, 20);
        obj1.display();
        StaticVariableDemo obj2 = new StaticVariableDemo(100, 200);
        System.out.println("oBJ2:");
        obj2.display();
        System.out.println("oBJ1:");
        obj1.display();
    }

    static {
        System.out.println("Im in static");
    }
}
