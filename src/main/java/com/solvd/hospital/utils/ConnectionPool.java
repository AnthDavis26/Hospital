package com.solvd.hospital.utils;

import java.util.concurrent.LinkedBlockingQueue;

public class ConnectionPool {
    private static ConnectionPool instance;
    private static LinkedBlockingQueue<Connection> pool;
    private static final int MAX_POOL_CAPACITY = 10;
    private static Integer existingConnectionsCount = 0;

    private ConnectionPool(){} // Prevent construction

    public static ConnectionPool getInstance() {
        if (instance == null)
            instance = new ConnectionPool();

        return instance;
    }

    public Connection getConnection() throws InterruptedException {
        synchronized (existingConnectionsCount) {
            if (existingConnectionsCount < MAX_POOL_CAPACITY) {
                existingConnectionsCount++;
                return new Connection();
            }

            return pool.take();
        }
    }

    public void releaseConnection(Connection con) {
        synchronized (pool) {
            pool.add(con);
        }
    }
}
