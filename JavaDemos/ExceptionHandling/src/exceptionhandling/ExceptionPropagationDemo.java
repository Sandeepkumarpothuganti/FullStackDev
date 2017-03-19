/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionhandling;

import java.io.IOException;


public class ExceptionPropagationDemo {

    public static void main(String[] args) {
        firstFloor();
    }

    static void firstFloor() {
        secondFloor();
    }

    static void secondFloor() {
        thirdFloor();
    }

    static void thirdFloor() {
        try {
            fourthFloor();
        } catch (Exception ex) {
            System.out.println("Glass boul is caught..:)");
        }
    }

    static void fourthFloor() throws Exception {
        fifthFloor();
    }

    static void fifthFloor() throws IOException {
        System.out.println("Im in fifth floor and "
                + "throwing Glass boul(Exception)");
    }
}
