package MeetingClub;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class MeetingScadle {
    public static void main(String[] args) {
        LocalTime startOfPare= LocalTime.of(10,30);
        LocalTime endOfPare=startOfPare.plusHours(1).plusMinutes(15);

        System.out.println(startOfPare+" - " +endOfPare);

        long hour=startOfPare.until(endOfPare, ChronoUnit.HOURS);
        System.out.println("Лекция длиться полных: "+hour+"ч.");
        long minutes=startOfPare.until(endOfPare, ChronoUnit.MINUTES);
        System.out.println("Или: "+minutes+" минут.");
        long minutesOfHour=minutes - hour*60;
        System.out.println("Или: "+hour+"ч. и "+minutesOfHour+" минут.");

        //Duration

        System.out.println("{Duration class}");
        System.out.println();

        Duration lessonOfDuration=Duration.between(startOfPare, endOfPare);
        System.out.println("Пара длиться: "+lessonOfDuration.toHoursPart()+" ч. и "+lessonOfDuration.toMinutesPart()+" минут.");

        Duration oneCircleTime=Duration.ofMinutes(2).plusSeconds(30);
        Duration runningDuration=Duration.ofMinutes(21);

        long circleAmount=runningDuration.dividedBy(oneCircleTime);

        System.out.println("Атлет пробежал: "+circleAmount+" кругов.");

        Duration oneCircleDuration=runningDuration.dividedBy(9);
        System.out.println("Атлет пробежал один круг за: "+oneCircleDuration.toMinutesPart()+" м. и "+oneCircleDuration.toSecondsPart()+" секунд.");

        System.out.println("--------------");

        LocalDateTime now=LocalDateTime.now();
        System.out.println(now  );
    }

}
