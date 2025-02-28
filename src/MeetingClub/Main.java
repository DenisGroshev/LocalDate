package MeetingClub;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        LocalDate startDate = LocalDate.of(2050, Month.MARCH, 24);
        // Форматируем, чтобы узнать день недели этой даты

        DateTimeFormatter formatterForWeekDay = DateTimeFormatter.ofPattern("dd.MM.yyyy - EE");

        System.out.println("начальная дата: " + startDate.format(formatterForWeekDay));


   LocalDate nextThursday=findNearestThursdayFrom(startDate);
// Создаём функцию которая в параметрах сравнивает начальный день и следющий день заседания
   if(nextThursday.equals(startDate)){
      nextThursday=nextThursday.plusWeeks(1);
       System.out.println("Следующая встреча будет: "+nextThursday.format(formatterForWeekDay));
   } else {
       System.out.println("Ближайший четверг: " + nextThursday.format(formatterForWeekDay));
   }

        LocalDate endOfEvents=startDate.plusMonths(1).plusWeeks(2);
        System.out.println("Конец встреч: "+ endOfEvents.format(formatterForWeekDay));


        LocalDate nextMeetingAt=nextThursday;
        while(nextMeetingAt.isBefore(endOfEvents)){
            System.out.println("Встреча будет: "+nextMeetingAt.format(formatterForWeekDay));
            nextMeetingAt=nextMeetingAt.plusWeeks(1);
        }
    }

    // Поиск ближайшего четверга в неделе
    private static LocalDate findNearestThursdayFrom(LocalDate date){
        LocalDate nextDay=date;

        while(!(nextDay.getDayOfWeek().equals(DayOfWeek.THURSDAY))  )
        {
            nextDay=nextDay.plusDays(1);
        } return nextDay;
    }
}