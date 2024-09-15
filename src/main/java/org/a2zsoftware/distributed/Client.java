package org.a2zsoftware.distributed;

import org.a2zsoftware.util.Log;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;

public class Client extends Channel {

    private String hostName;
    private int serverPort;

    public Client(String hostName, int serverPort) {
        this.hostName = hostName;
        this.serverPort = serverPort;
        connect();
    }

    void connect() {
        try {
            Log.debug(this, "Client trying to connect to " + hostName + " on port: " + serverPort);
            SocketAddress socketAddress = new InetSocketAddress(hostName, serverPort);
            Socket socket = new Socket();
            socket.connect(socketAddress);
            Log.debug(this, "Connected to " + hostName + " on port: " + serverPort);
            init(socket);
        } catch (IOException e) {
            throw new IllegalArgumentException("Can not connect to " + hostName + " on port " + serverPort, e);
        }
    }

}
