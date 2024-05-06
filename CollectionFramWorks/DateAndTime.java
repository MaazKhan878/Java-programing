package CollectionFramWorks;
import java.util.*;
public class DateAndTime {
    public static void main(String[] args) {
        // Number of millisecon convert to second %1000 then %60 minute then %60 Hour
        // then %24 days then %365 year
        System.out.println(((((System.currentTimeMillis()/1000)/60)/60)/24)/365);
        System.out.println(System.currentTimeMillis()/1000+" Second");
        System.out.println(System.currentTimeMillis()/1000/60+" Minute");
        System.out.println(System.currentTimeMillis()/1000/60/60/24+" days");
        System.out.println(System.currentTimeMillis()/1000/60/60/24/365+" Year");
        Date d = new Date();
        System.out.println(d);
        System.out.println(d.getTime());
        System.out.println(d.getHours());
        System.out.println(d.getDate());
        Date d1 = new Date();
        System.out.println(d1);
        // Calender Class : Abstract class
        Calendar c = Calendar.getInstance();
        System.out.println(c.getCalendarType());
        System.out.println(c.getTimeZone());
        Calendar c1 = Calendar.getInstance(TimeZone.getTimeZone("Asia/Singapore"));
        System.out.println(c1.getTimeZone());
        // Oracle For more function
    }
}
