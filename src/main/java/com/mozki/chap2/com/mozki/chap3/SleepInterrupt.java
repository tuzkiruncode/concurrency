package com.mozki.chap2.com.mozki.chap3;

public class SleepInterrupt extends  Object implements  Runnable{
    @Override
    public void run() {
        try {
            System.out.println("in run() - about to sleep for 20 seconds");
            Thread.sleep(20000);
            System.out.println("in run() - waking up");
        } catch (InterruptedException e) {
            System.out.println("in run() - interrupted while sleeping");
            return ;
        }
        System.out.println("in run() - leaving normally");
    }

    public static void main(String[] args) {
        SleepInterrupt sleepRunner = new SleepInterrupt();
        Thread t = new Thread(sleepRunner);
        t.start();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("in main() - interrupting other thread");
        t.interrupt();
        System.out.println("in main() - leaving");
    }
}
