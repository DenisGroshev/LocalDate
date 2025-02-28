package MeetingClub;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class Sputnik {
    public static void main(String[] args) {

        LocalDateTime now=LocalDateTime.now();
        LocalDate sputnikOneLaunchDate=LocalDate.of(1957, Month.OCTOBER, 4);
        LocalTime sputnikOneLaunchTime=LocalTime.of(22,28,34);
        LocalDateTime sputnikOneAtLaunch=LocalDateTime.of(sputnikOneLaunchDate, sputnikOneLaunchTime);

        long years = ChronoUnit.YEARS.between(sputnikOneAtLaunch, now);
        LocalDateTime reducedDateTime= sputnikOneAtLaunch.plusYears(years);

        long months=ChronoUnit.MONTHS.between(reducedDateTime, now);
        reducedDateTime=reducedDateTime.plusMonths(months);

        long days=ChronoUnit.DAYS.between(reducedDateTime, now);
        reducedDateTime=reducedDateTime.plusDays(days);

        long hours=ChronoUnit.HOURS.between(reducedDateTime, now);
        reducedDateTime=reducedDateTime.plusHours(hours);

        long minutes=ChronoUnit.HOURS.between(reducedDateTime, now  );
        reducedDateTime=reducedDateTime.plusMinutes(minutes);

        long seconds=ChronoUnit.SECONDS.between(reducedDateTime,now);


        System.out.println("Года: "+years);
        System.out.println("месяцы: "+months);
        System.out.println("дни: "+days);
        System.out.println("часы: "+hours);
        System.out.println("минуты: "+minutes);
        System.out.println("секунды: "+seconds);

    }
}
