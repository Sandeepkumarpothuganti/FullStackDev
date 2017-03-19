/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streams;

import java.io.Console;


public class ConsoleDemo {

    public static void main(String args[]) {
        Console c = System.console();
        System.out.println("Enter your name: ");
        String n = c.readLine();
        while (n == null) {
            n = c.readLine();
            System.out.println("Welcome " + n);
        }
    }
}
