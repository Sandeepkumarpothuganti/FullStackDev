/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;


public class StudentPerson extends Person {

    private int rno;
    private String name;
    private static String schoolname;
    private transient String address;
    private int totalMarks;

    @Override
    public String toString() {
        return rno + " " + name + " " + schoolname + " " + address + " " + totalMarks; //To change body of generated methods, choose Tools | Templates.
    }

    public StudentPerson() {
    }

    public StudentPerson(int rno, String name, String schoolname, String address) {
        this.rno = rno;
        this.name = name;
        this.schoolname = schoolname;
        this.address = address;
    }

    public void setTotalMarks(int totalMarks) {
        this.totalMarks = totalMarks;
    }

}
