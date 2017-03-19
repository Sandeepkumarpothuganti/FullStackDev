/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threaddemo;

import java.util.logging.Level;
import java.util.logging.Logger;


public class SampleClass {

    public void fun1() {
        for (int i = 0; i < 10; i++) {
            System.out.println("In fun1()");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
            }
        }
    }

    public void fun2() {
        for (int i = 0; i < 10; i++) {
            System.out.println("In fun2()");
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
            }
        }
    }

}
