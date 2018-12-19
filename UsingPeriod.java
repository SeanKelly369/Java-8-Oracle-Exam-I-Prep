import java.time.*;

public class UsingPeriod {

    public static void main(String[] args) {
        LocalDate start = LocalDate.of(2017, Month.JANUARY, 1);
        LocalDate end = LocalDate.of(2017, Month.APRIL, 30);
        Period period = Period.ofWeeks(1);
        // start.toEpochDay();  // number of days since January 1 1970


        cleanAnimalCage(start, end);

        System.out.println(start.plus(period));
        System.out.println(LocalDateTime.now().plus(period));
//      System.out.println(LocalTime.now().plus(period)); // unsupported unit day

        Period yearAndMonth = Period.ofYears(1).ofMonths(1);
        System.out.println(yearAndMonth); // will print 1 month, cannot chain

        Period annually = Period.ofYears(1); // every 1 year
        Period quarterly = Period.ofMonths(3); // every 3 months
        Period everyThreeWeeks = Period.ofWeeks(3); // every 3 weeks
        Period everyOtherDay = Period.ofDays(2); // every 2 days
        Period everyYearAndAWeek = Period.of(1, 0, 7); // every year and 7 days
    }

    public static void cleanAnimalCage(LocalDate start, LocalDate end) {
        while (start.isBefore(end)) {
            System.out.println("Need to clean the cage on date= " + start);
            start = start.plusMonths(1); // adding 1 month
        }

    }
}
