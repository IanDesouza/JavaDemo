package org.a2zsoftware.tasks;

public class Task {
    private final String name;

    public Task(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "processing: " + name;
    }
}
