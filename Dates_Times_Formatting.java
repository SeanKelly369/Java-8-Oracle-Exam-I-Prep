import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Dates_Times_Formatting {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
        System.out.println(date.getDayOfWeek()); // MONDAY
        System.out.println(date.getMonth()); // JANUARY
        System.out.println(date.getYear()); // 2020
        System.out.println(date.getDayOfYear()); // 20

        LocalDate date2 = LocalDate.of(2020, Month.JANUARY, 20);
        LocalTime time = LocalTime.of(11, 12, 34);
        LocalDateTime dateTime = LocalDateTime.of(date2, time);
        System.out.println(date2.format(DateTimeFormatter.ISO_LOCAL_DATE));
        System.out.println(dateTime.format(DateTimeFormatter.ISO_DATE_TIME));

        DateTimeFormatter shortDateTime =
                DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        System.out.println(shortDateTime.format(dateTime)); // 1/20/20
        System.out.println(shortDateTime.format(date)); // 1/20/20
//        System.out.println(
//                shortDateTime.format(time)); // UnsupportedTemporalTypeException

//        DateTimeFormatter shortDateTime2 =
//                DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
//        System.out.println(dateTime.format(shortDateTime2));
//        System.out.println(date.format(shortDateTime2));
//        System.out.println(time.format(shortDateTime2));

        DateTimeFormatter shortF =
                DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
        DateTimeFormatter mediumF =
                DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
        System.out.println(shortF.format(dateTime));
        System.out.println(mediumF.format(dateTime));

        DateTimeFormatter f = DateTimeFormatter.ofPattern(("MMMM dd, yyyy, " +
                "hh:mm"));
        System.out.println(dateTime.format(f));
        // 085 168 1138
        LocalDateTime dateTime2 = LocalDateTime.now();
        System.out.println(dateTime2);
        DateTimeFormatter dateTime2Formatted =
                DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
        System.out.println(dateTime2.format(dateTime2Formatted));
    }
}
