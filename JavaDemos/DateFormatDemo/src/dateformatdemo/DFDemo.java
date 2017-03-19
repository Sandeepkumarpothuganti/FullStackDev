/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dateformatdemo;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;


public class DFDemo {

    public static void main(String[] args) {
//        Date d = new Date();
//        System.out.println(d);
//        String str = DateFormat.getDateInstance().format(d);
//        System.out.println(str);
//        str = DateFormat.getTimeInstance().format(d);
//        System.out.println(" DateFormat.getTimeInstance().format(d)\t" + str);
//
//        str = DateFormat.getDateTimeInstance().format(d);
//        System.out.println(" DateFormat.getDateTimeInstance().format(d)\t" + str);
//        str = DateFormat.getTimeInstance(DateFormat.SHORT).format(d);
//        System.out.println("Short:  " + str);
//        str = DateFormat.getTimeInstance(DateFormat.MEDIUM).format(d);
//        System.out.println("MEDIUM:  " + str);
//        str = DateFormat.getTimeInstance(DateFormat.LONG).format(d);
//        System.out.println("LONG:  " + str);

//        SimpleDateFormat formatter = new 
//        SimpleDateFormat("E, dd MMM yyyy HH:mm:ss z", Locale.ENGLISH);
        Date d = new Date();
        System.out.println(d);
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MMM/YYYY  HH:mm:ss:SSS   D E ");
        String str = formatter.format(d);
        System.out.println(str);
        call();
    }

    static void call() {
        call();
        File f = new File(""
        );
        f.createNewFile();
    }
}
