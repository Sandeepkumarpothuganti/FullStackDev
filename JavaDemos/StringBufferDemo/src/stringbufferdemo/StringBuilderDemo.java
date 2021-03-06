/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringbufferdemo;


public class StringBuilderDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        String str = "Hello";
//        str.concat(" world");
//        System.out.println(str);

        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" world");
        System.out.println(sb);
        System.out.println(sb.length() + "  " + sb.capacity());
        System.out.println("");

        StringBuilder sbForCapacity = new StringBuilder();
        System.out.println(sbForCapacity.capacity());
        //case 1:
        sbForCapacity.ensureCapacity(15);
        System.out.println(sbForCapacity.capacity());
        //case 2:
        sbForCapacity.ensureCapacity(20);
        System.out.println(sbForCapacity.capacity());

        sbForCapacity.ensureCapacity(35);
        System.out.println(sbForCapacity.capacity());

    }

}
