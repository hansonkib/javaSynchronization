package com.hanson;

/**
 * @author hanson kibet
 */
public class Power {
    // non-synchronized method for calculating the power of n
    public void printPower(int n){
        int temp = 1;
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName()+" : "+n+"^"+i+" = "+n*temp);
            temp = n * temp;

            try {
                Thread.sleep(500); //pausing the execution of the current thread for 500 mls
            }
            catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
class Thread1 extends Thread{ //creating thread1
    Power p;
    Thread1(Power p){
        this.p = p;
    }
    public void run(){ //performing action for the thread
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

