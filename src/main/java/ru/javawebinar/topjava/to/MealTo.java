package ru.javawebinar.topjava.to;

import java.time.LocalDateTime;

public class MealTo {
    private Integer id;
    protected final LocalDateTime dateTime;
    protected final String description;
    protected final int calories;
    protected final boolean excess;
    protected final Integer userId;

    public MealTo(LocalDateTime dateTime, String description, int calories, boolean excess, Integer userId) {
        this(null, dateTime, description, calories, excess, userId);
    }

    public MealTo(Integer id, LocalDateTime dateTime, String description, int calories, boolean excess, Integer userId) {
        this.id = id;
        this.dateTime = dateTime;
        this.description = description;
        this.calories = calories;
        this.excess = excess;
        this.userId = userId;
    }

    public Integer getUserId() {
        return userId;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public String getDescription() {
        return description;
    }

    public int getCalories() {
        return calories;
    }

    public boolean isExcess() {
        return excess;
    }

    public Integer getId() {
        return id;
    }

    @Override
    public String toString() {
        return "MealTo{" +
                "dateTime=" + dateTime +
                ", description='" + description + '\'' +
                ", calories=" + calories +
                ", exceed=" + excess +
                '}';
    }
}
