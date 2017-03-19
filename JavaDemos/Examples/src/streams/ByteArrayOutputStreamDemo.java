/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package streams;

import java.io.*;  
public class ByteArrayOutputStreamDemo {  
public static void main(String args[])throws Exception{    
      FileOutputStream fout1=new FileOutputStream("D:\\f1.txt");    
      FileOutputStream fout2=new FileOutputStream("D:\\f2.txt");    
        
      ByteArrayOutputStream bout=new ByteArrayOutputStream();    
      bout.write(65);    
      bout.writeTo(fout1);    
      bout.writeTo(fout2);    
        
      bout.flush();    
      bout.close();//has no effect    
      System.out.println("Success...");    
     }    
    }   