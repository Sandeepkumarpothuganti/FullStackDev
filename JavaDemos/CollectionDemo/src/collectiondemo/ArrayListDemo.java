/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectiondemo;

import java.util.ArrayList;
import java.util.Iterator;


public class ArrayListDemo {

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>(4);
        arrayList.add("Str1");
        arrayList.add("Str2");
        arrayList.add("Str3");
        arrayList.add("Str4");
        arrayList.add("Str1");

//        for (int i = 0; i < arrayList.size(); i++) {
//            System.out.println(arrayList.get(i));
//        }
//        //For each loop
//        for (String str : arrayList) {
//            System.out.println(str);
//        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
