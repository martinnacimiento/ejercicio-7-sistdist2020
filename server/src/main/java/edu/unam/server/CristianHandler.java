package edu.unam.server;

import org.apache.thrift.TException;

import cristian.Cristian;

public class CristianHandler implements Cristian.Iface {
    @Override
    public long getTime() throws TException {
        long time = System.currentTimeMillis();
        return time;
    }
}