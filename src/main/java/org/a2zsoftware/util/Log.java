package org.a2zsoftware.util;

public class Log {

    public static void debug(Object object, String message, Object... args) {
        String theClass = object instanceof Class ? ((Class<?>) object).getSimpleName() : object.getClass().getSimpleName();
        Timestamp timeStamp = new Timestamp();
        String threadName = Thread.currentThread().getName();
        System.out.println(timeStamp + " " + threadName + " " + theClass + " " + String.format(message, args));
    }
}
