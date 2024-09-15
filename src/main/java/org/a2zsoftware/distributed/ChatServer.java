package org.a2zsoftware.distributed;

import java.util.function.Consumer;

public class ChatServer implements Consumer<ServerRunnable> {

    public static void main(String[] args) {
        ChatServer chatServer = new ChatServer(55555);
        chatServer.waitForConnections();
    }

    private Server server;

    public ChatServer(int port) {
        server = new Server(port, this);
    }

    public void waitForConnections() {
        server.waitForConnections();
    }

    /**
     * for each client connection, this method is called with the socket for each client within a thread
     * @param serverRunnable the input argument
     */
    @Override
    public void accept(ServerRunnable serverRunnable) {
        while (true) {
            String message = serverRunnable.getMessage();  // read the message from the client
            server.broadcastMessage(message);
        }
    }
}
