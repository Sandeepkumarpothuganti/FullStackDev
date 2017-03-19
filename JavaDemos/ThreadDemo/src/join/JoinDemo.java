/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package join;


public class JoinDemo {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Entered Main()");

        Thread t1 = new MyThread();
        t1.setName("T1");
        System.out.println("joined()");
        t1.start();
        t1.join(5000);

        Thread.sleep(5000);
        for (int i = 0; i < 10; i++) {
            System.out.println("for : " + i);
        }
        System.out.println("Exiting the main()");
    }
}
