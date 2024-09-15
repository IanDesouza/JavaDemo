package org.a2zsoftware.distributed;

import org.a2zsoftware.util.Log;

public class ChatClient implements Runnable {

    public static void main(String[] args) throws InterruptedException {
        ChatClient chatClient = new ChatClient("localhost", 55555);
        Thread thread = new Thread(chatClient, "ChatClient");
        thread.start();
        Thread.sleep(100);
        chatClient.sendMessage("hello world");
    }

    private final Client client;

    ChatClient(String hostname, int port) {
        client = new Client(hostname, port);
    }

    private void waitForResponses() {
        Log.debug(this, "waiting for responses from server");
        while (true) {
            String message = client.getMessage();  // blocking until the server sends a message
        }
    }

    private void sendMessage(String message) {
        client.sendMessage(message);
    }

    @Override
    public void run() {
        waitForResponses();
    }
}
