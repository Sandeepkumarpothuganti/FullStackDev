package synchronisation;

import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class RaceCondition implements Runnable {

    private Account account = new Account();

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            withdrawing(100);
            if (account.getBalance() < 0) {
                System.out.println("Account is overdrawn");
            }
        }
    }

    private synchronized void withdrawing(int amount) {
        System.out.println(Thread.currentThread().getName()
                + " is ready to withdraw.");
        if (account.getBalance() > 0) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
            }

            account.withdraw(amount);
            System.out.println(Thread.currentThread().getName()
                    + " has withdrawn the amount.");

        } else {
            System.out.println("Exisiting balance-->" + account.getBalance());
        }
    }

}
