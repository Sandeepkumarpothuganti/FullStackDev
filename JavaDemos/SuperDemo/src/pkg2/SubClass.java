/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2;


public class SubClass extends SuperClass {

    static int j;
    int i;

    public void get() {
        System.out.println(this);
    }

    public static void main(String[] args) {
        SubClass obj = new SubClass();
        obj.get();
        System.out.println(obj);
        System.out.println(obj.j);
    }
}
