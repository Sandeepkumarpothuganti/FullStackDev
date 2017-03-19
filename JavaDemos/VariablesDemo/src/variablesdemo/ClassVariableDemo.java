/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package variablesdemo;


public class ClassVariableDemo {

    int classVariable = 20;

    public void method1() {
        int temp = 0;
        System.out.println(temp);
    }

    public void method2() {
        int temp1 = classVariable;
        System.out.println(temp1);
    }

    public static void main(String[] args) {
        ClassVariableDemo obj = new ClassVariableDemo();
        System.out.println(obj.classVariable);
        obj.method1();
        obj.method2();
    }
}
