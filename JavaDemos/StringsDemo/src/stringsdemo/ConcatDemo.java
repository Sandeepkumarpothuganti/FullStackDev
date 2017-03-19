/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringsdemo;


public class ConcatDemo {

    public static void main(String[] args) {
//        case 1:
        String s1 = "Hello";
        String s2 = " World";
        String s3 = "Hi " + s1 + s2 + "!";
        System.out.println(s3);
//        case 2:

        String str1 = "Hello";
        String str2 = str1 + 10 + 10;
        String str3 = str1 + (10 + 10);
        String str4 = 10 + str1;
        String str5 = 10 + 40 + str1;
        String str6 = str1 + 10 + 40;
        String str7 = 10 + 20 + str1 + (10 + 40);
//        System.out.println(str2 + str3);
        System.out.println(str7);
//        case 3
        String str = "Hello";
        str = str.concat(10 + 20 + " World");
        System.out.println(str);

    }
}
