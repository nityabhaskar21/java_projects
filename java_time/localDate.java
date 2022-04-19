package java_time;
import java.time.LocalDate;    

public class localDate {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.of(2017, 1, 13); 
        System.out.println(date1.getDayOfWeek());   
    }
}
