/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectiondemo;


public class EqualsAndHashCodeDemo {

    public static void main(String[] args) {
        Student sandeepObj = new Student(1, "sandeep", "St.Anns");
        Student sandeepObj1 = new Student(1, "sandeep", "St.Anns");
//        Student vishnuObj = new Student(2, "Vishnu", "St.Anns");
        System.out.println(sandeepObj.hashCode());
        System.out.println(sandeepObj1.hashCode());
//        System.out.println(sandeepObj.equals(sandeepObj1));
//        System.out.println(sandeepObj.equals(new VectorDemo()));
    }
}
