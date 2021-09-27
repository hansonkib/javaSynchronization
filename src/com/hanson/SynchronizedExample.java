package com.hanson;

/**
 * @author hanson kibet
 */
public class SynchronizedExample {
    public static void main(String[] args) {
        SynchronizedPower power = new SynchronizedPower(); //shared object
        ThreadOne t1 = new ThreadOne(power);
        ThreadTwo t2 = new ThreadTwo(power);
        t1.start();
        t2.start();
    }
}
