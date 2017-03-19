/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructordemo;


public class DefaultConstDemo {

    private int i;

    public void printI() {
        System.out.println(i);
    }

    public static void main(String[] args) {
        DefaultConstDemo obj = new DefaultConstDemo();
        obj.printI();
    }
}
