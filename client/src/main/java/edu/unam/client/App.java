package edu.unam.client;

import java.util.concurrent.TimeUnit;

import org.apache.thrift.TException;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;
import org.apache.thrift.transport.TTransportException;

import cristian.*;

public class App {
    public static void main(String[] args) {
        TTransport transport = new TSocket("server_7_thrift", 15000);
        TProtocol protocol = new TBinaryProtocol(transport);
        Cristian.Client client = new Cristian.Client(protocol);
        try {
            transport.open();
            long t1 = System.currentTimeMillis();
            long timeServer = client.getTime();
            long t2 = System.currentTimeMillis();
            long newTime = timeServer + ((t2 - t1)/2);
            System.out.println("Tiempo servidor: " + timeServer);
            System.out.println("Tiempo cliente:  " + newTime);
        } catch (TTransportException e) {
            e.printStackTrace();
        } catch (TException e) {
            e.printStackTrace();
        }
        
    }

    public static String getTime(long time) {
        return String.format("%02d:%02d:%02d", TimeUnit.MILLISECONDS.toHours(time),
            TimeUnit.MILLISECONDS.toMinutes(time) - TimeUnit.HOURS.toMinutes(TimeUnit.MILLISECONDS.toHours(time)),
            TimeUnit.MILLISECONDS.toSeconds(time) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(time)));
    }
}
