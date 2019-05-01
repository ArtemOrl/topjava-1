package ru.javawebinar.topjava;

import org.springframework.test.context.ActiveProfilesResolver;
import ru.javawebinar.topjava.Profiles;

//http://stackoverflow.com/questions/23871255/spring-profiles-simple-example-of-activeprofilesresolver
public class AllActiveProfileResolver implements ActiveProfilesResolver {

    @Override
    public String[] resolve(Class<?> aClass) {
        return new String[]{Profiles.REPOSITORY_IMPLEMENTATION, Profiles.getActiveDbProfile()};
    }
}