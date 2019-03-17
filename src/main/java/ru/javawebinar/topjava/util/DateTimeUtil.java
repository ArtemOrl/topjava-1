package ru.javawebinar.topjava.util;

import org.springframework.lang.Nullable;
import org.springframework.util.StringUtils;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeUtil {
    private static final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

    // DataBase doesn't support LocalDate.MIN/MAX
    public static final LocalDate MIN_DATE = LocalDate.of(1, 1, 1);
    public static final LocalDate MAX_DATE = LocalDate.of(3000, 1, 1);

    private DateTimeUtil() {
    }

    public static LocalDateTime adjustStartDateTime(LocalDate localDate) {
        return adjustDateTime(localDate, MIN_DATE, LocalTime.MIN);
    }

    public static LocalDateTime adjustEndDateTime(LocalDate localDate) {
        return adjustDateTime(localDate, MAX_DATE, LocalTime.MAX);
    }

    private static LocalDateTime adjustDateTime(LocalDate localDate, LocalDate defaultDate, LocalTime adjustTime) {
        return LocalDateTime.of(localDate != null ? localDate : defaultDate, adjustTime);
    }

    public static String toString(LocalDateTime ldt) {
        return ldt == null ? "" : ldt.format(DATE_TIME_FORMATTER);
    }

    public static LocalDate parseLocalDate(@Nullable String str) {
        return StringUtils.isEmpty(str) ? null : LocalDate.parse(str);
    }

    public static LocalTime parseLocalTime(@Nullable String str) {
        return StringUtils.isEmpty(str) ? null : LocalTime.parse(str);
    }
    public static LocalDate orElse(LocalDate localDate, LocalDate localDate1){
        // Если у нас в фильтре задано время но не задана дата, то:
        if (localDate1.equals(MIN_DATE) && localDate==null) return MIN_DATE;
        else if (localDate1.equals(MAX_DATE) && localDate==null) return MAX_DATE;
        if (localDate1.equals(MIN_DATE))
            return  localDate.isAfter(localDate) ? localDate : localDate1;
        else // (localDate1.equals(MAX_DATE))
            return  (localDate1.isAfter(localDate) ? localDate : localDate1);
    }
    public static LocalTime orElse(LocalTime localTime, LocalTime localTime1){
        if (localTime1==LocalTime.MIN && localTime==null) return LocalTime.MIN;
        else if (localTime1==LocalTime.MAX && localTime==null) return LocalTime.MAX;
        if (localTime1.equals(LocalTime.MIN))
            return localTime.isBefore(localTime1) ? localTime : localTime1;
        else if (localTime1.equals(LocalTime.MAX))
            return  (localTime1.isAfter(localTime) ? localTime : localTime1);

        else return LocalTime.MIN;
    }
}
