package java_time;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.Locale;

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

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSXXX");
        String dateInString = "2024-03-14T12:14:48.855+01:00"; 
        try {
            Date date = dateFormat.parse(dateInString);
            System.out.println(date);
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
