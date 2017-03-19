/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datatypedemo;


public class Demo1 {

    private DataTypeDemo obj1;

    public void method1() {
        if (obj1 != null) {
            System.out.println(obj1.getI());
        }else{
            System.out.println("obj1 is null");
        }
    }

    public static void main(String[] args) {
//        DataTypeDemo obj = new DataTypeDemo();
//        short temp = obj.s;
//        System.out.println("" + temp);
//        System.out.println(obj.getI());
        Demo1 obj = new Demo1();
//        System.out.println(obj.obj1);
        obj.method1();
    }
}
