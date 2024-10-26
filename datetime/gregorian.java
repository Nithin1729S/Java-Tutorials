package datetime;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class gregorian {
    public static void main(String[] args) {
        GregorianCalendar gc=new GregorianCalendar();
        System.out.println(gc.isLeapYear(2024));
        System.out.println(gc.get(Calendar.DATE));

        TimeZone tz=gc.getTimeZone();
        System.out.println(tz);

    }
}
