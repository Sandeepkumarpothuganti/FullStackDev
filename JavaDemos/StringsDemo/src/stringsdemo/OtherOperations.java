/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringsdemo;

public class OtherOperations {

    public static void main(String[] args) {
        String str = "Hello";
////        System.out.println(str.toLowerCase());
//        str = "Hello      ";
//        System.out.println(str.length());
//        System.out.println(str.trim().length());
//        str = "Hello";
//        System.out.println(str.charAt(2));
//        int i = 10;
//        String str1 = String.valueOf(i);
//        String str2 = "Hello";
//        System.out.println(str2.replaceAll("l", "m"));

        String strobj = new String("Hello");
        String s2 = strobj.intern();
//        System.out.println(str==s2);
//        System.out.println(strobj==s2);
        System.out.println(strobj.startsWith("e"));
        System.out.println(strobj.endsWith("llo"));
        System.out.println(strobj.contains("Ll"));

        String world = "World";
        world = world.toUpperCase();
        System.out.println(world);

    }

}
