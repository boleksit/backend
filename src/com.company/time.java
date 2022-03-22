package src.com.company;

import java.sql.Date;
import java.sql.Time;
import java.time.Clock;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class time {
    public static void main (String[] args)
    {
        DateTimeFormatter formatter =DateTimeFormatter.ofPattern("HH:mm");
        System.out.println("Local Time: "+LocalTime.now().format(formatter));
        System.out.println("UTC Time: "+LocalTime.now(Clock.systemUTC()).format(formatter));

    }
}
