/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serialisation;

import java.io.Serializable;


public class Student implements Serializable {

    private int rno;
    private String sname;
    private String address;
    private static String school = "St.Anns";

    public Student(int rno, String sname, String address) {
        this.rno = rno;
        this.sname = sname;
        this.address = address;
    }

    @Override
    public String toString() {
        return rno + " " + sname;
    }

    public Student() {
    }

}
