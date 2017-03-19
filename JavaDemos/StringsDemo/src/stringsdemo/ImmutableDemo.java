/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringsdemo;


public class ImmutableDemo {

    public static void main(String[] args) {
        String originalString = "Hello";
        System.out.println(originalString);
        originalString = originalString.concat(" World");
        System.out.println(originalString);
    }
}
