/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class2;


public class RuntimeExceptionDemo {

    public static void main(String[] args) {
// Nullpointer exception.
//        String str = null;
//        System.out.println(str.length());

// NumberFormatException
        String str1 = "adsnsd";
        int i = Integer.parseInt(str1);
        System.out.println(i);
    }
}
