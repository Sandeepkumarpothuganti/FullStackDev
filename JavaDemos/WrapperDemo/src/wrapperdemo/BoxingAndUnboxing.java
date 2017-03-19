/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wrapperdemo;

public class BoxingAndUnboxing {

    public static void main(String[] args) {
//        //Boxing
//        int a = 10;
//        Integer intObj = new Integer(a);
//        Integer intObj1 = Integer.valueOf(a);
        //AutoBoxing
        Integer autoInt = 10;
        autoInt++;

        //////
        System.out.println(autoInt);

//        //Unboxing
        Integer unboxIntObj = new Integer(20);
        int unboxInt = unboxIntObj.intValue();
//        //Auto Unboxing
        int autoUnbox = unboxIntObj;
//
//        System.out.println(unboxIntObj);
    }

}
