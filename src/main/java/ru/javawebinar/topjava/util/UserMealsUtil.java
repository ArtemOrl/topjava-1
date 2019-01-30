package ru.javawebinar.topjava.util;

import ru.javawebinar.topjava.model.UserMeal;
import ru.javawebinar.topjava.model.UserMealWithExceed;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class UserMealsUtil {
    public static void main(String[] args) {
        List<UserMeal> mealList = Arrays.asList(
                new UserMeal(LocalDateTime.of(2019, Month.JANUARY, 30,10,0), "Завтрак", 500),
                new UserMeal(LocalDateTime.of(2019, Month.JANUARY, 30,13,0), "Обед", 500),
                new UserMeal(LocalDateTime.of(2019, Month.JANUARY, 30,20,0), "Ужин", 500),
                new UserMeal(LocalDateTime.of(2019, Month.JANUARY, 30,10,0), "Завтрак", 500),
                new UserMeal(LocalDateTime.of(2019, Month.JANUARY, 30,13,0), "Обед", 500),
                new UserMeal(LocalDateTime.of(2019, Month.JANUARY, 30,20,0), "Ужин", 500)
        );

        getFilteredMealsWithExceed(mealList);
        //toLocalDate();
        //toLocalTime();
    }

    public static List<UserMealWithExceed> getFilteredMealsWithExceed(List<UserMeal> mealList){
        return null;
    }

}
