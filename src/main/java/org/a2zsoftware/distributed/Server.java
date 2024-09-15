package org.a2zsoftware.distributed;

import org.a2zsoftware.util.Log;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 * asdfga
 * adsfga
 * sdfg
 * <p>
 * asdfg
 * adfg
 * df
 * zg
 *
 * @see ServerSocket
 */
public class Server {
    private final Consumer<ServerRunnable> consumer;
    private final ServerSocket serverSocket;
    private final List<ServerRunnable> serverRunnables = new ArrayList<>();

    public Server(int port, Consumer<ServerRunnable> consumer) {
        this.consumer = consumer;
        try {
            Log.debug(this, "ServerSocket on port: " + port);
            serverSocket = new ServerSocket(port);
        } catch (IOException e) {
            throw new IllegalArgumentException("Can not create a server socket", e);
        }
    }

    public void waitForConnections() {
        while (true) {
            try {
                Log.debug(this, "waiting for connection");
                Socket connectedSocket = serverSocket.accept();  // block; unblock creating a new socket for each client connected
                Log.debug(this, "client connected: " + connectedSocket);
                ServerRunnable serverRunnable = new ServerRunnable(connectedSocket, consumer);
                serverRunnables.add(serverRunnable);
                Thread clientThread = new Thread(serverRunnable);
                clientThread.start();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void broadcastMessage(String message) {
        for (ServerRunnable serverRunnable : serverRunnables) {
            serverRunnable.sendMessage(message);
        }
    }
}
