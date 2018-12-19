import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class Dates_Times {
    public static void main(String[] args) {
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());

        LocalDate date1 = LocalDate.of(2015, Month.JANUARY, 20);
        LocalDate date2 = LocalDate.of(2015, 1, 20);

        System.out.println(date1);
        System.out.println(date2);

        LocalTime time1 = LocalTime.of(6, 15);

        LocalDateTime dateTime1 = LocalDateTime.of(2015, Month.JANUARY, 20, 6
                , 15, 30);
        LocalDateTime dateTime2 = LocalDateTime.of(date1, time1);

        System.out.println(dateTime1);
        System.out.println(dateTime2);

        LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
        LocalTime time = LocalTime.of(5, 15);
        LocalDateTime dateTime =
                LocalDateTime.of(date2, time).minusDays(1).minusHours(10).minusSeconds(30);


    }
}
