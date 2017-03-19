/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package variablesdemo;


public class BlockVariableDemo {

    public static void main(String[] args) {
        int localVariable = 20;
        System.out.println("Inside main but outside and before block" + localVariable);
       
        {
            int blockVariable = 10;
            System.out.println("Inside block" + blockVariable);
            System.out.println("Inside block" + localVariable);
        }
         //Here can i access blockVariable?????
         System.out.println("Inside main but outside and after block" + localVariable);
    }
}
