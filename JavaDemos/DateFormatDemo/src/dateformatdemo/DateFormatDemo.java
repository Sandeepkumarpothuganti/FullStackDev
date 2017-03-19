/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dateformatdemo;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;


public class DateFormatDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Date d = new Date();
        String str = DateFormat.getDateInstance(DateFormat.SHORT, Locale.ENGLISH).format(d);
        System.out.println(str);
        str = DateFormat.getDateInstance(DateFormat.SHORT, Locale.CHINESE).format(d);
        System.out.println(str);
        str = DateFormat.getDateInstance(DateFormat.SHORT, Locale.ITALIAN).format(d);
        System.out.println(str);
        str = DateFormat.getDateInstance(DateFormat.SHORT, Locale.TAIWAN).format(d);
        System.out.println(str);
        SimpleDateFormat formatter = new SimpleDateFormat("E, dd MMM yyyy HH:mm:ss z", Locale.ENGLISH);
        str = formatter.format(d);
        System.out.println("Date Format with E, dd MMM yyyy HH:mm:ss z : " + str);

    }

}
