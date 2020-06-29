package com.mozki.chap2;

public class RunnableDemo {
    public static void main(String[] args) {
        MyRunnble myRunnble = new MyRunnble();
        new Thread(myRunnble).start();
        new Thread(myRunnble).start();
        new Thread(myRunnble).start();
    }
}
class MyRunnble implements  Runnable{
    private int ticket = 5;
    @Override
    public void run() {
        for (int i = 0  ; i < 10; i++) {
            if(ticket > 0)
            {
                System.out.println("ticket =" + ticket--);
            }
        }
    }
}
