package org.a2zsoftware.tasks;

import org.a2zsoftware.util.Log;

import java.util.concurrent.BlockingQueue;

public class TaskProducer implements Runnable {
    private BlockingQueue<Task> blockingQueue;

    public TaskProducer(BlockingQueue<Task> blockingQueue) {
        this.blockingQueue = blockingQueue;
    }

    @Override
    public void run() {
        Log.debug(this, "In producer run method pushing tasks");
        for (int count = 0; count < 6; count++) {
            Task task = new Task("task" + count);
            Log.debug(this, "Producer pushing " + task);
            blockingQueue.add(task);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        Log.debug(this, Thread.currentThread().getName() + " Producer is shutting down");
    }
}
