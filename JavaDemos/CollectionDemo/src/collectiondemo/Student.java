/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectiondemo;

import java.util.Objects;


public class Student implements Comparable<Student> {

    @Override
    public int compareTo(Student o) {
        return name.compareTo(o.name);
//        return o.name.compareTo(name);
    }

    private int rno;
    private String name;
    private String schoolName;

    @Override
    public String toString() {
//        return rno + " " + name + " " + schoolName;
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Student) {
            Student sandeepObj1 = (Student) obj;
            return rno == sandeepObj1.rno
                    && name.equals(sandeepObj1.name)
                    && schoolName.equals(sandeepObj1.schoolName);
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + this.rno;
        hash = 37 * hash + Objects.hashCode(this.name);
        hash = 37 * hash + Objects.hashCode(this.schoolName);
        return hash;
    }

    public Student() {

    }

    public Student(int rno, String name, String schoolName) {
        this.rno = rno;
        this.name = name;
        this.schoolName = schoolName;
    }

    /**
     * @return the rno
     */
    public int getRno() {
        return rno;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the schoolName
     */
    public String getSchoolName() {
        return schoolName;
    }

}
