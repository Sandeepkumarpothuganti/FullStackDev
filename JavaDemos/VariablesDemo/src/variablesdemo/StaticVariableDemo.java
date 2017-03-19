/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package variablesdemo;


public class StaticVariableDemo {

    static int classVariable = 20;

    public void method() {
        System.out.println(classVariable);
    }

    public static void main(String[] args) {
        System.out.println(classVariable);
    }
}
