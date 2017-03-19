/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package initialisationblockdemo;

public class PieceofCommonCode {

    public PieceofCommonCode() {
        System.out.println("Specific to default const");
    }

    public PieceofCommonCode(int i) {
        System.out.println("Specific to  one param const");
    }

    public PieceofCommonCode(int i, int j) {
        System.out.println("Specific to  2 param const");
    }

    {
        System.out.println("Im in block2");
        System.out.println("Hello2");
    }

    {
        System.out.println("Im in block3");
        System.out.println("Hello3");
    }

    public static void main(String[] args) throws InterruptedException {
        System.out.println("First Obj");
        PieceofCommonCode obj = new PieceofCommonCode(0, 1);
        Thread.sleep(1000);
        System.out.println("Second Obj");
        PieceofCommonCode obj1 = new PieceofCommonCode(0, 1);
        Thread.sleep(1000);
        System.out.println("Third Obj");
        PieceofCommonCode obj2 = new PieceofCommonCode(0, 1);

    }

    {
        System.out.println("Im in block1");
        System.out.println("Hello1");
    }
}
