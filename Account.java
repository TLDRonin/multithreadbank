public class Account {

                //balance remaining

                private double balance;

               

                //constructor to initialize account with balance $1000

                public Account() {

                                balance = 1000;

                }

               

                //synchronized method that will deposit money to the account.

                //depositor - name of depositor

                //amount - amount being deposited

                public synchronized void deposit(String depositor, double amount) {

                                System.out.println(depositor + " depositing $" + amount);

                                //pausing for .2 seconds

                                try {

                                               Thread.sleep(200);

                                } catch (InterruptedException e) {

                                               e.printStackTrace();

                                }

                                //depositing

                                balance += amount;

                                //finished

                                System.out.println("Deposit success, new balance: $" + balance);

                }

               

                //synchronized method that will withdraw money from the account.

                //withdrawer - name of withdrawer

                //amount - amount being withdrawn

                public synchronized void withdraw(String withdrawer, double amount) {

                                System.out.println(withdrawer + " withdrawing $" + amount);

                                //pausing for .5 seconds

                                try {

                                               Thread.sleep(500);

                                } catch (InterruptedException e) {

                                               e.printStackTrace();

                                }

                                //withdrawing only if balance does not become negative

                                if ((balance - amount) >= 0) {

                                               balance -= amount;

                                               System.out.println("Withdrawal success, new balance: $" + balance);

                                } else {

                                               System.out.println("Not enough balance to withdraw $" + amount);

                                }

                }

}