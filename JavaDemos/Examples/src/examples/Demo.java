/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examples;

public class Demo {

    public static void main(String[] args) {
//        ThreadDemo r = new ThreadDemo(1);
//        Thread t = new Thread(r);
//        t.setName("M1");
//        t.start();
//        ThreadDemo r1 = new ThreadDemo(2);
//        Thread t1 = new Thread(r1);
//        t1.setName("M2");
//        t1.start();
        
        ThreadDemo1 td=new ThreadDemo1(1);
        td.start();
    }
}
