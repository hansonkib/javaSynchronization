package com.hanson;

public class NonSynchronizedExample {
    public static void main(String[] args) {
        Power power = new Power();
        Thread1 t1 = new Thread1(power);
        Thread2 t2 = new Thread2(power);
        t1.start();
        t2.start();
    }
}
