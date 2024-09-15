package org.a2zsoftware;

import org.a2zsoftware.tasks.Task;
import org.a2zsoftware.tasks.TaskConsumer;
import org.a2zsoftware.tasks.TaskProducer;

import java.io.IOException;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<Task> blockingQueue = new LinkedBlockingQueue<>();
        Thread producer = new Thread(new TaskProducer(blockingQueue), "Producer");
        Thread consumer = new Thread(new TaskConsumer(blockingQueue), "Consumer1");
        Thread consumer2 = new Thread(new TaskConsumer(blockingQueue), "Consumer2");
        producer.start();
        consumer.start();
        consumer2.start();
        producer.join();
        consumer.join();
        consumer2.join();
    }
}