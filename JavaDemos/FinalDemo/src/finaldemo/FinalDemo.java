/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finaldemo;


public class FinalDemo {

    private final int temp = 10;

    public void display() {
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        final int temp = 10;
        System.out.println("temp=" + temp);
        {
            final int temp1 = 10;

        }
    }

}
