package com.hanson;

public class Power {
    void printPower(int n){
        int temp = 1;
        for (int i = 1; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName()+" : "+n+"^"+i+" = "+n*temp);
            temp = n * temp;

            try {
                Thread.sleep(500);
            }
            catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
class Thread1 extends Thread{
    Power p;
    Thread1(Power p){
        this.p = p;
    }
    public void run(){
        p.printPower(5);
    }
}

class Thread2 extends Thread{
    Power p;
    Thread2(Power p){
        this.p = p;
    }
    public void run(){
        p.printPower(8);
    }
}

