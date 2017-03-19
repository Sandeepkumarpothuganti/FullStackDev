/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package map;

import collectiondemo.Student;
import java.util.HashMap;


public class HashMapDemo {

    public static void main(String[] args) {
        HashMap<Integer, Student> hashMap = new HashMap<>(3);
        Student st1 = new Student(1, "Vishnu", "St.Anns");
        Student st2 = new Student(2, "Venkatesh", "St.Anns");
        Student st3 = new Student(3, "Sandeep", "St.Anns");
        Student st4 = new Student(4, "Abcd", "St.Anns");
        hashMap.put(st2.hashCode(), st2);
        hashMap.put(st3.hashCode(), st3);
        hashMap.put(st1.hashCode(), st1);
        hashMap.put(st4.hashCode(), st4);
        hashMap.put(null, st4);
        hashMap.put(null, null);
        System.out.println(hashMap);
    }
}
