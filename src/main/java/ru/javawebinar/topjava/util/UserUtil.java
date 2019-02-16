package ru.javawebinar.topjava.util;

import ru.javawebinar.topjava.model.Meal;
import ru.javawebinar.topjava.model.Role;
import ru.javawebinar.topjava.model.User;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UserUtil {

    static Set<Role> set = new HashSet<>();
    static {
        set.add(Role.ROLE_USER);
        set.add(Role.ROLE_ADMIN);
    }
    //public User( String name, String email, String password, Set<Role> roles) {
    public static final List<User> Users = Arrays.asList(
            new User("Vasya", "vasya@mail.com", "123456", Role.ROLE_USER),
            new User("Petya", "petya@mail.com", "123456", Role.ROLE_USER),
            new User("Vanya", "vanya@mail.com", "123456", Role.ROLE_USER),
            new User("Olya", "olya@mail.com", "123456", Role.ROLE_USER),
            new User("Artem", "artem@mail.com", "123456", Role.ROLE_USER)
    );

}
