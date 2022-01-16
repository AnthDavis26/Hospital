package com.solvd.hospital.utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DeadlockThread2 extends Thread {
    private static final Logger LOGGER = LogManager.getLogger(DeadlockThread2.class);

    public void run() {
        synchronized (DeadlockLocks.lock2)
        {
            LOGGER.info("Deadlock Thread 2 on lock 2");

            try {
                Thread.sleep(10);
            } catch (Exception e) {
                LOGGER.error(e);
            }

            synchronized (DeadlockLocks.lock1)
            {
                LOGGER.info("Deadlock Thread 2 on lock 1");
            }
        }
    }
}
