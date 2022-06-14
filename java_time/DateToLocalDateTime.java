package java_time;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

public class DateToLocalDateTime {
    public static void main(String[] args) {

        //Date to LocalDateTime
        Date d = new Date();
        System.out.println("Date: " + d);

        LocalDateTime l = d.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
        System.out.println("LocalDateTime: " + l);

        
        //LocalDateTime to Date
        Date d1 = Date.from(l.atZone(ZoneId.systemDefault()).toInstant());
        System.out.println("Date: " + d1);


    }
}
