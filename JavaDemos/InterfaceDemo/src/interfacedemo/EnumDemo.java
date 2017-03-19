/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacedemo;

public class EnumDemo {

    enum Season {

        plus {
                    int performOperation(int op1, int op2) {
                        return op1 + op2;
                    }
                },
        mul {
                    int performOperation(int op1, int op2) {
                        return op1 * op2;
                    }
                };

        private Season() {
            System.out.println("In season");
        }

        abstract int performOperation(int op1, int op2);

    }

    public static void main(String[] args) {
        Season s
                = Season.plus;

        int a[] = {0, 10, 20, 30, 40};
        for (int temp : a) {
            System.out.println(temp);
        }
    }

}
