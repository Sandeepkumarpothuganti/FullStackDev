/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectiondemo;


public class Array1D_Demo {

    public static void main(String[] args) {
        int arr[] = new int[4];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        
        arr[3]=50;

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        int arr1[] = {1, 2, 3, 4};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr1[i]);
        }
        String[] strArr = {"Str1", "Str2"};
        String [] strArr1 = {"Str1", "Str2"};
        String strArr2[] = {"Str1", "Str2"};
    }
}
