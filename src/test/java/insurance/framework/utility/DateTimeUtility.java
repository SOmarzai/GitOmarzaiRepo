package insurance.framework.utility;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateTimeUtility {

    public static String getCurrentDate(){
        LocalDate now = Instant.now().atZone(ZoneId.of("America/New_York"))
                .toLocalDate();
        DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
        return formatter.format(now);
    }
    public static String getExpiredDate(){
        LocalDate now = Instant.now().atZone(ZoneId.of("America/New_York")).plusDays(1)
                .toLocalDate();
        DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
        return formatter.format(now);
    }
}
