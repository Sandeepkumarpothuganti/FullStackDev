/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class2;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import myExceptions.InValidException;


public class ThrowAndThrowsDemo {

    /**
     * Throws Runtime exception, when x is negative.
     *
     * @param x
     */
    public static void throwRuntimeException(int x) {
        if (x < 0) {
            throw new ArithmeticException("x is not postive");
        } else {
            System.out.println("x is postive.");
        }
    }

    /**
     * Throws Compile time exception, when x is negative.
     *
     * @param x
     */
    public static void throwCompiletimeException(int x) throws IOException {
        if (x < 0) {
            throw new IOException("x is not postive");
        } else {
            System.out.println("x is postive.");
        }
    }

    /**
     * Throws Custom exception, when x is negative.
     *
     * @param x
     */
    public static void throwCustomException(int x) throws InValidException {
        if (x < 0) {
            throw new InValidException("x is not postive");
        } else {
            System.out.println("x is postive.");
        }
    }

    public static void main(String[] args) {
        try {
            throwCustomException(-10);
        } catch (InValidException ex) {
            ex.printMessage();
            ex.printStackTrace();
        }
    }
}
