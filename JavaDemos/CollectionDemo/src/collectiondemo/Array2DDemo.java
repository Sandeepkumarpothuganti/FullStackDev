/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectiondemo;


public class Array2DDemo {

    public static void main(String[] args) {
        int _2dArr1[][] = new int[2][3];
        int[] _2dArr[] = new int[2][3];
        int row0[] = {1, 2, 3};
        int row1[] = {4, 5, 6};
        _2dArr[0] = row0;
        _2dArr[1] = row1;
        for (int i = 0; i < _2dArr.length; i++) {
            for (int j = 0; j < _2dArr[i].length; j++) {
                System.out.print(_2dArr[i][j] + "\t");
            }
            System.out.println("");
        }
        
        int _3d[][][]=new int[2][2][3];
    }
}
