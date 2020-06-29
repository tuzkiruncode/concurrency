package com.mozki.chap2.com.mozki.chap3;

public class IterruptCheck {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        System.out.println("point A: t.isinterrupted: "+ t.isInterrupted());
        t.interrupt();
        System.out.println("point B: t.isinterrupted: "+ t.isInterrupted());
        System.out.println("point C: t.isinterrupted: "+ t.isInterrupted());

        try{
            Thread.sleep(2000);
            System.out.println("not interrupted");
        }catch(InterruptedException e){
            System.out.println("was interrupted");
        }
        System.out.println("point D: t.isinterrupted: "+ t.isInterrupted());
    }
}
