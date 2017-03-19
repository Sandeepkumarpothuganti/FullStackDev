/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staticdemo;


public class Employee {

    private int empID;
    private String empName;
    private static String companyName;

    public Employee() {
    }

    public Employee(int empID1, String empName1) {
        empID = empID1;
        empName = empName1;
    }

    public Employee(int empID1, String empName1, String companyName1) {
        this(empID1, empName1);
        companyName = companyName1;
    }

    public void displayDetails(Employee emp) {
        System.out.println(emp.empID);
        System.out.println(emp.empName);
        System.out.println(emp.companyName);
    }

    public void method1(Employee emp) {
        System.out.println("Using this keyword :");
        displayDetails(this);
        System.out.println("With out this:");
        displayDetails(emp);
    }

    public static void main(String[] args) {
        Employee emp1Obj = new Employee(1, "John", "Dell");
        emp1Obj.method1(emp1Obj);
        Employee emp2Obj = new Employee(2, "Ram", "Dell");
        emp2Obj.displayDetails(emp2Obj);
        Employee emp3Obj = new Employee(3, "Rahim", "Dell");
        emp3Obj.displayDetails(emp3Obj);

    }
}
