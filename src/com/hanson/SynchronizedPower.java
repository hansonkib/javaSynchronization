package com.hanson;

public class SynchronizedPower {
    synchronized void printPower(int n){
        int temp = 1;
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName()+": "+n+"^"+i+" = "+n*temp);
            temp = n * temp;
            try {
                Thread.sleep(500);
            }catch (Exception e){
                System.out.println(e);
            }
        }
    }
}
class ThreadOne extends Thread{
    SynchronizedPower power;
    ThreadOne(SynchronizedPower p){
        this.power = p;
    }

    @Override
    public void run() {
        power.printPower(5);
    }
}
class ThreadTwo extends Thread{
    SynchronizedPower power;
    ThreadTwo(SynchronizedPower p){
        this.power = p;
    }

    @Override
    public void run() {
        power.printPower(8);
    }
}