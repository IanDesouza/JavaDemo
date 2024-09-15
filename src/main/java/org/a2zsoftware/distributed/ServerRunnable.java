package org.a2zsoftware.distributed;

import org.a2zsoftware.util.Log;

import java.net.Socket;
import java.util.function.Consumer;

public class ServerRunnable extends Channel implements Runnable {

    private final Consumer<ServerRunnable> consumer;

    ServerRunnable(Socket connectedSocket, Consumer<ServerRunnable> consumer) {
        super(connectedSocket);
        this.consumer = consumer;
    }

    @Override
    public void run() {
        try {
            consumer.accept(this);
        } catch (Exception e) {
            Log.debug(this, "ServerSocket thread exiting. Connected client stopped. " + e);
        }
    }

}
