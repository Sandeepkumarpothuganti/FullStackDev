/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myExceptions;


public class InValidException extends Exception {

    private String message;

    public InValidException() {
    }

    public InValidException(String message) {
        super(message);
        this.message = message;
    }

    public void printMessage() {
        System.out.println(message);
    }
}
