/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package setsDemo;

import collectiondemo.Student;
import java.util.Iterator;
import java.util.LinkedHashSet;


public class LinkedHashSetDemo1 {

    public static void main(String[] args) {
        LinkedHashSet<String> hs = new LinkedHashSet<>(3);
        hs.add("Vishnu");
        hs.add("Sandeep");
        hs.add("Abcdef");
        hs.add("Venkatesh");
        hs.add("Venkatesh");
        System.out.println(hs);
        for (Iterator<String> it = hs.iterator(); it.hasNext();) {
            String string = it.next();
            System.out.println(string);
        }
//        LinkedHashSet<Student> hs1 = new LinkedHashSet<>();
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
//        for (Iterator<Student> it = hs1.iterator(); it.hasNext();) {
//            Student student = it.next();
//            
//        }
    }
}
