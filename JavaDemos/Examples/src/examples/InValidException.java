/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examples;


public class InValidException extends Exception {

    public InValidException() {
    }

    public InValidException(String exceptionInformation) {
        super(exceptionInformation);
    }
}
