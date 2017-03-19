/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class2;

public class AssertErrorDemo {

    public static void method1(int x) {
        assert x > 0 : "X is negative";
        System.out.println("X is postive");
    }

    public static void main(String[] args) {
        method1(-10);
    }
}
