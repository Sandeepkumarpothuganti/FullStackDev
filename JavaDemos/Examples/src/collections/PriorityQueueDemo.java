/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

import java.util.Iterator;
import java.util.PriorityQueue;


public class PriorityQueueDemo {

    public static void main(String args[]) {

        PriorityQueue<String> queue = new PriorityQueue<String>();
        queue.add("Amit");
        queue.add("Vijay");
        queue.add("Karan");
        queue.add("Jai");
        queue.add("Rahul");

//        System.out.println("head:" + queue.element());
//        System.out.println("head:" + queue.peek());

        System.out.println("iterating the queue elements:");
        Iterator itr = queue.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

//        queue.remove();
//        queue.poll();
//
//        System.out.println("after removing two elements:");
//        Iterator<String> itr2 = queue.iterator();
//        while (itr2.hasNext()) {
//            System.out.println(itr2.next());
//        }

    }
}
