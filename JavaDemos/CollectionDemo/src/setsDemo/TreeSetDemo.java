/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package setsDemo;

import collectiondemo.Student;
import java.util.HashSet;
import java.util.TreeSet;


public class TreeSetDemo {

    public static void main(String[] args) {
        TreeSet<String> hs = new TreeSet<>();
        hs.add("Vishnu");
        hs.add("Sandeep");
        hs.add("Abcdef");
        hs.add("Venkatesh");
        hs.add("Venkatesh");
        hs.add("Bcded");
        System.out.println(hs);

    }
}
