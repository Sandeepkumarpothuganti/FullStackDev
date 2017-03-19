/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringsdemo;

import java.text.DateFormat;


public class StringsDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String s = "Hello World";
        System.out.println(s.hashCode());
        s=s.concat("1");
        System.out.println(s.hashCode());
        System.out.println("Hello World".hashCode());
    }

}
