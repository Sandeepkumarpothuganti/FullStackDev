/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

import java.io.Serializable;
import serialization.Student;


public class C1 implements Serializable {

    private StudentPerson studentPerson;
    private Student student;
    private C2 c2Obj;

    public C1(StudentPerson studentPerson, Student student) {
        this.studentPerson = studentPerson;
        this.student = student;
        c2Obj = new C2();
    }

    @Override
    public String toString() {
        return "Student Person:" + studentPerson + "\nStudent" + student; //To change body of generated methods, choose Tools | Templates.
    }

}
