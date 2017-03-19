/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staticdemo;


public class CountDemo {

    private static int count;

    public CountDemo() {
        Object obj;
        count++;
    }

    public static void main(String[] args) {
        int temp = CountDemo.count;
        System.out.println("Count:" + count);

        CountDemo obj1 = new CountDemo();
        System.out.println("Count:" + count);

        CountDemo obj2 = new CountDemo();
        CountDemo obj3 = new CountDemo();

        System.out.println("Count:" + count);
        CountDemo obj4 = new CountDemo();

        System.out.println("Count:" + count);

    }
}
