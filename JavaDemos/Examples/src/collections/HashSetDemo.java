/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

import java.util.HashSet;
import java.util.Iterator;


public class HashSetDemo {

    public static void main(String args[]) {

        HashSet<Integer> al = new HashSet<Integer>();
        al.add("Ravi".hashCode());
        al.add("Vijay".hashCode());
        al.add("Ravi".hashCode());
        al.add("Ajay".hashCode());

        Iterator<Integer> itr = al.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
