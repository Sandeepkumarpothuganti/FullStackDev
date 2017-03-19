/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphismdemo;


public class PolyMorphismDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Class1 objClass1 = new Class1();
//        objClass1.class1Method();
//        objClass1.method1();
//        objClass1.method2();

        //
//        Class2 objClass2 = new Class2();
//        objClass2.class2Method();
//        objClass2.method1();
//        objClass2.method2();
//        Class1 obj1RefClass2 = new Class2();///Yes
//        obj1RefClass2.class1Method();
//        obj1RefClass2.method1();
//        obj1RefClass2.method2();
//        Upcasting
//        Class2 objClass2 = (Class2) new Class1();///-----------------let us see (yes)
//        objClass2.class2Method();
//        Class1 obj1Class3 = new Class3();
//        obj1Class3.method1();
//
//        Class1 obj1Class2 = new Class2();
//        obj1Class2.method1();
//        Class2 obj2Class3 = new Class3();
//        obj2Class3.method1();
//        Class3 obj3Class3 = (Class3) new Class2();
//        obj3Class3.method1();
//
        Class3 obj4Class3 = (Class3) new Class1();
        obj4Class3.class3Method();
        obj4Class3.class2Method();
        obj4Class3.class1Method();

    }

}
