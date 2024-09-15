package org.a2zsoftware.util;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Timestamp {

    private static SimpleDateFormat dateTimeFormatter = new SimpleDateFormat("yyyy-MM-dd.HH:mm:ss.SSS.Z");
//    private static DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ISO_LOCAL_DATE_TIME;

    private Date instant = new Date();
//    Instant instant1 = Instant.now();

    @Override
    public String toString() {
        return dateTimeFormatter.format(instant);
//        return dateTimeFormatter1.format(instant1);
    }
}
