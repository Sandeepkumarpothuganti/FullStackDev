/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package map;

import java.util.SortedMap;
import java.util.TreeMap;


public class BackedCollections {

    public static void main(String[] args) {
        TreeMap<Integer, Integer> mainMap = new TreeMap<>();
        mainMap.put(1, 10);
        mainMap.put(2, 20);
        mainMap.put(3, 30);
        mainMap.put(5, 50);//{4,40} is missing
        mainMap.put(6, 60);
        mainMap.put(8, 80);//{7,70} is missing
        mainMap.put(9, 90);
        mainMap.put(11, 110);//{10,100} is missing
        mainMap.put(12, 120);
        mainMap.put(13, 130);
        mainMap.put(15, 150);//{14,140} is missing
        System.out.println(mainMap);
        SortedMap<Integer, Integer> subMap = mainMap.subMap(3, 9);
        System.out.println(subMap);

        subMap.put(4, 40);
        System.out.println("Backing by updating submap");
        System.out.println(mainMap);
        System.out.println(subMap);
        mainMap.put(7, 70);
        System.out.println("Backing by updating Main map ( with in range)");
        System.out.println(mainMap);
        System.out.println(subMap);
        mainMap.put(14, 140);
        mainMap.put(10, 100);
        System.out.println("Backing by updating Main map ( out of range)");
        System.out.println(mainMap);
        System.out.println(subMap);

    }
}
