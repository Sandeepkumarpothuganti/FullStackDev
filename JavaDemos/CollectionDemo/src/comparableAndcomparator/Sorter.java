/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparableAndcomparator;

import collectiondemo.Student;
import java.util.Comparator;


public class Sorter implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getRno() - o2.getRno();
    }

}
