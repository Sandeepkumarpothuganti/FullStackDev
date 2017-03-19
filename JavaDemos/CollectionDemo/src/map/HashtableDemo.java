/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package map;

import collectiondemo.Student;
import java.util.HashMap;
import java.util.Hashtable;


public class HashtableDemo {

    public static void main(String[] args) {
        Hashtable<Integer, Student> hashtable = new Hashtable<>(3);
        Student st1 = new Student(1, "Vishnu", "St.Anns");
        Student st2 = new Student(2, "Venkatesh", "St.Anns");
        Student st3 = new Student(3, "Sandeep", "St.Anns");
        Student st4 = new Student(4, "Abcd", "St.Anns");
        hashtable.put(st2.hashCode(), st2);
        hashtable.put(st3.hashCode(), st3);
        hashtable.put(st1.hashCode(), st1);
        hashtable.put(st4.hashCode(), st4);
//        hashtable.put(null, st4);
//        hashtable.put(2, null);
        System.out.println(hashtable);
    }
}
