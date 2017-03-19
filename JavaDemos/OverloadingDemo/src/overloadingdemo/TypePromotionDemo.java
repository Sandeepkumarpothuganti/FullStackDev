/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overloadingdemo;


public class TypePromotionDemo {

    public TypePromotionDemo() {
    }

    public TypePromotionDemo(int param1) {
    }

    public TypePromotionDemo(long param1) {
    }

    public long getSum(long op1, long op2) {
        System.out.println("Im in long getSum() ");
        return op1 + op2;
    }

    public long getSum(int op1, int op2) {
        System.out.println("Im in int getSum() ");
        return op1 + op2;
    }

    public long getSum(long op1, int op2) {
        System.out.println("Im in long and int getSum() ");
        return op1 + op2;
    }

    public static void main(String[] args) {
        TypePromotionDemo obj = new TypePromotionDemo();
        long temp1 = 10;
        int temp2 = 40;
        System.out.println(obj.getSum(temp2, temp1));
    }
}
