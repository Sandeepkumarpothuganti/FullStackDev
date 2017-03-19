/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package setsDemo;

import collectiondemo.Student;
import java.util.HashSet;
import java.util.Iterator;


public class HashSetDemo {

    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>(3);
        hs.add("Vishnu");
        hs.add("Sandeep");
        hs.add("Abcdef");
        hs.add("Venkatesh");
        hs.add("Venkatesh");

//        HashSet<Student> hs1 = new HashSet<>();
//
//        Student sandeepObj = new Student(1, "sandeep", "St.Anns");
//        Student sandeepObj1 = new Student(1, "sandeep", "St.Anns");
//        Student vishnuObj = new Student(2, "Vishnu", "St.Anns");
//
//        hs1.add(sandeepObj);
//        hs1.add(sandeepObj1);
//        hs1.add(vishnuObj);
//
//        System.out.println(hs1.size());
        System.out.println(hs);
    }
}
