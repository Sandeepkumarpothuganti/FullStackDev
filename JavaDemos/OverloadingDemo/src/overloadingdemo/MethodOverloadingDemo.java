/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overloadingdemo;


public class MethodOverloadingDemo {

    public int getSum(int op1, int op2) {
        return op1 + op2;
    }

    public int getSum(int op1, int op2, int op3) {
        return op1 + op2 + op3;
    }

    public long getSum(long op1, long op2) {
        return op1 + op2;
    }

    public long getSum(int op1, long op2) {
        return op1 + op2;
    }

    public static void main(String[] args) {
        MethodOverloadingDemo obj=new MethodOverloadingDemo();
        System.out.println(obj.getSum(10, 20));
        System.out.println(obj.getSum(10, 20,30));
        System.out.println(obj.getSum(10, 20l));
        System.out.println(obj.getSum(10l, 20l));
    }
}
