/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enumdemo;

public class AbstarctMethods_Enum {

    enum Operations {

        ADD {
                    int performOperation(int op1, int op2) {
                        return op1 + op2;
                    }
                },
        MUL {
                    int performOperation(int op1, int op2) {
                        return op1 * op2;
                    }
                };

        abstract int performOperation(int op1, int op2);
    }

    public static void main(String[] args) {
        Operations add = Operations.ADD;
        System.out.println("" + add.performOperation(10, 20));
        Operations mul = Operations.MUL;
        System.out.println("" + mul.performOperation(10, 20));
    }

}
