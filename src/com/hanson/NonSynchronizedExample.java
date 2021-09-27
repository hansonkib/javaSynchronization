package com.hanson;

/**
 * @author hanson kibet
 */
public class NonSynchronizedExample {
    public static void main(String[] args) {
        Power power = new Power();//shared object
        Thread1 t1 = new Thread1(power);
        Thread2 t2 = new Thread2(power);
//        starting the execution of thread
        t1.start();
        t2.start();
    }
}
