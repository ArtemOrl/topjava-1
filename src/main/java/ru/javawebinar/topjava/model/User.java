package ru.javawebinar.topjava.model;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.EnumSet;
import java.util.Set;

import static ru.javawebinar.topjava.model.Role.ROLE_USER;
import static ru.javawebinar.topjava.util.MealsUtil.DEFAULT_CALORIES_PER_DAY;

public class User  {
    private Integer id;

    private String name;

    private String email;

    private String password;

    private boolean enabled = true;

    private LocalDateTime registered = LocalDateTime.now();

    private Role roles;

    private int caloriesPerDay = DEFAULT_CALORIES_PER_DAY;

    public User( String name, String email, String password, Role roles) {
        this(null, name, email, password, true, LocalDateTime.now(), roles, 2000);
    }

//    public User(Integer id, String name, String email, String password, int caloriesPerDay, boolean enabled, Set<Role> roles) {
//        super(id, name);
//        this.email = email;
//        this.password = password;
//        this.caloriesPerDay = caloriesPerDay;
//        this.enabled = enabled;
//        this.roles = roles;
//    }


    public User(Integer id, String name, String email, String password, boolean enabled, LocalDateTime registered, Role roles, int caloriesPerDay) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.enabled = enabled;
        this.registered = registered;
        this.roles = roles;
        this.caloriesPerDay = caloriesPerDay;
    }

//    public User(Integer id, String name, String email, String password, boolean enabled, LocalDateTime registered, Role roles, int caloriesPerDay) {
//        this.id = id;
//        this.name = name;
//        this.email = email;
//        this.password = password;
//        this.enabled = enabled;
//        this.registered = registered;
//        this.roles = roles;
//        this.caloriesPerDay = caloriesPerDay;
//    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRoles(Role roles) {
        this.roles = roles;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LocalDateTime getRegistered() {
        return registered;
    }

    public void setRegistered(LocalDateTime registered) {
        this.registered = registered;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public int getCaloriesPerDay() {
        return caloriesPerDay;
    }

    public void setCaloriesPerDay(int caloriesPerDay) {
        this.caloriesPerDay = caloriesPerDay;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public Role getRoles() {
        return roles;
    }

    public String getPassword() {
        return password;
    }

    public boolean isNew(){return id == null;}

    @Override
    public String toString() {
        return "User (" +
                "id=" + id +
                ", email=" + email +
                ", name=" + name +
                ", enabled=" + enabled +
                ", roles=" + roles +
                ", caloriesPerDay=" + caloriesPerDay +
                ')';
    }
}