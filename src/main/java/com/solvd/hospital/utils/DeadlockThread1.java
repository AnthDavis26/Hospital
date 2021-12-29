package com.solvd.hospital.utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DeadlockThread1 extends Thread {
    private static final Logger logger = LogManager.getLogger(DeadlockThread1.class);

    public void run() {
        synchronized (DeadlockLocks.lock1)
        {
            logger.info("Deadlock Thread 1 on lock 1");

            try {
                Thread.sleep(10);
            } catch (Exception e) {
                logger.error(e);
            }

            synchronized (DeadlockLocks.lock2)
            {
                logger.info("Deadlock Thread 1 on lock 2");
            }
        }
    }
}
