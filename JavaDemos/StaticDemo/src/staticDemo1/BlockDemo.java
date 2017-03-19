/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staticDemo1;


public class BlockDemo {

    {

        int x = 10;
        System.out.println("   block1");
    }
    static int i;

    public void m1() {

    }

    {
        int y = 20;
        System.out.println("   block3");

    }

    {
        int z = 40;
        System.out.println("   block2");

    }

    static {
        System.out.println("  static  block");
    }

    public static void main(String[] args) {
//        BlockDemo obj = new BlockDemo();
    }
}
