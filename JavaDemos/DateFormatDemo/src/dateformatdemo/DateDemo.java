/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dateformatdemo;

import java.util.Date;


public class DateDemo {

    public static void main(String[] args) throws InterruptedException {
        Date date = new Date();
        System.out.println(date);

        Thread.sleep(1000);
        long time = System.currentTimeMillis();
        System.out.println(time);
        Date date1 = new Date(time);
        System.out.println(date1);
        System.out.println(date1.getTime());
    }
}
