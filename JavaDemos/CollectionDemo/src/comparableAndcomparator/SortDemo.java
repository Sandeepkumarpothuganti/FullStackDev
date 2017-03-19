/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparableAndcomparator;

import collectiondemo.Student;
import java.util.ArrayList;
import java.util.Collections;


public class SortDemo {

    public static void main(String[] args) {
        ArrayList<Student> listOfStudents = new ArrayList<>();
        Student st1 = new Student(1, "Vishnu", "St.Anns");
        Student st2 = new Student(2, "Venkatesh", "St.Anns");
        Student st3 = new Student(3, "Sandeep", "St.Anns");
        Student st4 = new Student(4, "Abcd", "St.Anns");
        Student st5 = new Student(5, "Shannu", "St.Anns");
        Student st6 = new Student(6, "Waseem", "St.Anns");
        listOfStudents.add(st6);
        listOfStudents.add(st3);
        listOfStudents.add(st5);
        listOfStudents.add(st4);
        listOfStudents.add(st1);
        listOfStudents.add(st2);
        System.out.println("Before  sorting\n" + listOfStudents);
        Sorter sorter = new Sorter();
        Collections.sort(listOfStudents);
        System.out.println("Asc Order\n" + listOfStudents);
        Collections.sort(listOfStudents);
        System.out.println("Desc Order\n" + listOfStudents);

    }
}
