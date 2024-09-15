package org.a2zsoftware.distributed;

import org.a2zsoftware.util.Log;

import java.io.*;
import java.net.Socket;

public class Channel {

    private Socket socket;
    private BufferedReader bufferedReader;
    private PrintWriter bufferedWriter;

    Channel() {
    }

    Channel(Socket socket) {
        init(socket);
    }

    void init(Socket socket) {
        this.socket = socket;
        try {
            this.bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            this.bufferedWriter = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()), true);
            Log.debug(this, "reader and writer are created");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public String getMessage() {
        try {
            Log.debug(this, "blocked on reading from socket input");
            String message = bufferedReader.readLine();
            Log.debug(this, "read message from socket input: " + message);
            return message;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void sendMessage(String message) {
        Log.debug(this, "sending message to socket output: " + message);
        bufferedWriter.println(message);
    }
}
