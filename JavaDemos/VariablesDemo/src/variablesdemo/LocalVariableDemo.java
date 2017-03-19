/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package variablesdemo;


public class LocalVariableDemo {
    
//1st way of local variables
    public void localVariableMethod() {
        int localVariable = 0;
        System.out.println(localVariable);
    }
//2nd way of local variables
    public void display(int parameter) {
        System.out.println(parameter);
    }

    public static void main(String[] args) {
//        How can i access localVariableMethod from here
        LocalVariableDemo obj = new LocalVariableDemo();
//        obj.localVariableMethod();
        obj.display(10);
    }
}
