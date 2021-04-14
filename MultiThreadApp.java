import java.util.Random;

 

public class MultiThreadApp {

                //random number generator

                static Random random = new Random();

                //number of runs

                static int numRuns = 50;

 

                public static void main(String[] args) {

                                //creating an Account

                                final Account account = new Account();

                                //creating a thread for the husband

                                Thread husband = new Thread(new Runnable() {

 

                                               @Override

                                               public void run() {

                                                               //depositing/withdrawing random amount for 50 times

                                                               for (int i = 0; i < numRuns; i++) {

                                                                               if (random.nextBoolean()) {

                                                                                               account.deposit("Husband", random.nextInt(100));

                                                                               }else{

                                                                                               account.withdraw("Husband", random.nextInt(100));

                                                                               }

                                                               }

 

                                               }

                                });

                                //creating a thread for the wife

                                Thread wife = new Thread(new Runnable() {

 

                                               @Override

                                               public void run() {

                                                               //depositing/withdrawing random amount for 50 times

                                                               for (int i = 0; i < numRuns; i++) {

                                                                               if (random.nextBoolean()) {

                                                                                               account.deposit("Wife", random.nextInt(100));

                                                                               }else{

                                                                                               account.withdraw("Wife", random.nextInt(100));

                                                                               }

                                                               }

 

                                               }

                                });

                                //starting both threads

                                husband.start();

                                wife.start();

                }

}