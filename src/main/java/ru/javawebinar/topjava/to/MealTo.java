package ru.javawebinar.topjava.to;

import java.time.LocalDateTime;

public class MealTo {
    private Integer id;
    protected final LocalDateTime dateTime;
    protected final String description;
    protected final int calories;
    protected final boolean excess;

    public MealTo(LocalDateTime dateTime, String description, int calories, boolean excess) {
        this(null, dateTime, description, calories, excess);
    }

    public MealTo(Integer id, LocalDateTime dateTime, String description, int calories, boolean excess) {
        this.id = id;
        this.dateTime = dateTime;
        this.description = description;
        this.calories = calories;
        this.excess = excess;
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