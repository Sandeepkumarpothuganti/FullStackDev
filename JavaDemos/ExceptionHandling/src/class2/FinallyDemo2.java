/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class2;


public class FinallyDemo2 {

    public static int method1() {
        int x = 5;
        try {
            System.out.println("Im in try");
            return x;
        } finally {
            System.out.println("Im in finally");
        }
    }

    public static void main(String[] args) {
        method1();
    }
}
