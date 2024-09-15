package org.a2zsoftware.tasks;

import org.a2zsoftware.util.Log;

import java.io.IOException;
import java.util.concurrent.BlockingQueue;

public class TaskConsumer implements Runnable {
    private BlockingQueue<Task> blockingQueue;

    public TaskConsumer(BlockingQueue<Task> blockingQueue) {
        this.blockingQueue = blockingQueue;

    }

    @Override
    public void run() {
        Log.debug(this, "In consumer run method processing task ");
        while (true) {
            try {
                Task task = blockingQueue.take();  // block until something shows up on the queue
                Log.debug(this, "Consumer pulled " + task);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
