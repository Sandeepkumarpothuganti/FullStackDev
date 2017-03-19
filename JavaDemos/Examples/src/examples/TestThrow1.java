/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examples;

public class TestThrow1 {

    static void validate(int age) {
        age = age / 0;
        if (age < 18) {
            throw new ArithmeticException("not valid");
        } else {
            System.out.println("welcome to vote");
        }
    }

    public static void main(String args[]) {
        validate(13);
        System.out.println("rest of the code...");
    }
}
