/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectiondemo;

import java.util.LinkedList;


public class LinkedListDemo {

    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("str1");
        linkedList.add("str2");
        linkedList.add("str3");
        linkedList.add("str4");
        linkedList.add("str5");
        linkedList.add("str1");
        linkedList.add("str2");
        linkedList.add("str3");
        linkedList.add("str4");
        linkedList.add("str5");
        System.out.println(linkedList);
        linkedList.get(4);
        final int x = 0;
        final int y = 2;
        switch (y) {
            case x: {
                System.out.println("A");
            }
            case 1:
                System.out.println("B");
            default:
                System.out.println("default");
                break;
            case 2:
                System.out.println("C");
                break;

        }
    }
}
