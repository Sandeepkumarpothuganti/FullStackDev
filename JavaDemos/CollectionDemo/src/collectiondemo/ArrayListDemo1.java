/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectiondemo;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;


public class ArrayListDemo1 {

    public static void main(String[] args) {
        ArrayList<String> al1 = new ArrayList<>();
        al1.add("Vishnu");
        al1.add("Sandeep");
        al1.add("Shannu");
        al1.add("Waseem");

        System.out.println("Initial strength:" + al1);

        ArrayList<String> al_Present = new ArrayList<>();
        al_Present.add("Vishnu");
        al_Present.add("Sandeep");

        al1.retainAll(al_Present);
        System.out.println(al1);
        System.out.println(al1.contains("waseem"));

        TreeMap<Integer, String> hm = new TreeMap<Integer, String>();

        hm.put(1000, "Amit");
        hm.put(101, "Vijay");
        hm.put(102, "Rahul");
        for (Map.Entry<Integer, String> entry : hm.entrySet()) {
            Integer integer = entry.getKey();
            String string = entry.getValue();
            System.out.println(hm);
        }
    }
}
