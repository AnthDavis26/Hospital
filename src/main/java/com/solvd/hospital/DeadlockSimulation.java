package com.solvd.hospital;

import com.solvd.hospital.utils.DeadlockThread1;
import com.solvd.hospital.utils.DeadlockThread2;

public class DeadlockSimulation {
    public static void main(String[] args) {
        DeadlockThread1 thread1 = new DeadlockThread1();
        DeadlockThread2 thread2 = new DeadlockThread2();

        thread1.start();
        thread2.start();
    }
}
