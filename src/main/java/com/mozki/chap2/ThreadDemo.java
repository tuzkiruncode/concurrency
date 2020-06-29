package com.mozki.chap2;

class MyThread extends Thread {
    private int ticket = 5;

    @Override
    public void run() {
        for (int i = 0; i< 10; i++){
            if(ticket  > 0){
                System.out.println("ticket = " + ticket--);
            }
        }
    }
}
public class ThreadDemo{
    public static void main(String[] args) {
        new MyThread().start();
        new MyThread().start();
        new MyThread().start();
    }
}
