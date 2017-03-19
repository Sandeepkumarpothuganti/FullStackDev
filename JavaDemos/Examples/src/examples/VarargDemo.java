/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examples;


public class VarargDemo {

    public static void method1(int... varargs) {
        for (int i = 0; i < varargs.length; i++) {
            System.out.print(varargs[i] + "\t");
        }
        System.out.println("");
    }

    public void m2(float f, int... int1) {
    }

    public static void main(String[] args) {
        System.out.println("Zero vararg");
        method1();
        System.out.println("1 vararg");
        method1(1);
        System.out.println("2 vararg");
        method1(1, 2);
        System.out.println("3 vararg");
        method1(1, 2, 3);
        System.out.println("4 vararg");
        method1(1, 2, 3, 4);

    }
}
