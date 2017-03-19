/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package initialisationblockdemo;


public class IIBDemo {

    private int i = 10;
    private int j = 20;
    private int k;
    private int l;
    private int[] a = new int[1000];

    public IIBDemo() {
        System.out.println("Im in a const.");
    }

    public void display() {
        System.out.println("Im in a display method.");
    }
//Instance Initialization block

    {
        i = 10;
        j = 20;
        k = 30;
        l = 40;
        for (int m = 0; m < 1000; m++) {
            a[m] = m;
        }
        try {

        } catch (Exception e) {
        }

    }

}
