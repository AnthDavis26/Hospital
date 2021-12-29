package com.solvd.hospital.utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DeadlockThread2 extends Thread {
    private static final Logger logger = LogManager.getLogger(DeadlockThread2.class);

    public void run() {
        synchronized (DeadlockLocks.lock2)
        {
            logger.info("Deadlock Thread 2 on lock 2");

            try {
                Thread.sleep(10);
            } catch (Exception e) {
                logger.error(e);
            }

            synchronized (DeadlockLocks.lock1)
            {
                logger.info("Deadlock Thread 2 on lock 1");
            }
        }
    }
}
