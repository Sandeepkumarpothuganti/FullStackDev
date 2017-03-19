/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package map;

import collectiondemo.Student;
import java.util.TreeMap;


public class TreeMapDemo {

    public static void main(String[] args) {
        TreeMap<Integer, Student> treeMap = new TreeMap<>();
        Student st1 = new Student(1, "Vishnu", "St.Anns");
        Student st2 = new Student(2, "Venkatesh", "St.Anns");
        Student st3 = new Student(3, "Sandeep", "St.Anns");
        Student st4 = new Student(4, "Abcd", "St.Anns");
        treeMap.put(st2.getRno(), st2);
        treeMap.put(st3.getRno(), st3);
        treeMap.put(st1.getRno(), st1);
        treeMap.put(st4.getRno(), st4);
//        treeMap.put(null, st4);
        treeMap.put(0, null);
        System.out.println(treeMap);
        treeMap.put(0, st4);
        System.out.println(treeMap);
    }
}
