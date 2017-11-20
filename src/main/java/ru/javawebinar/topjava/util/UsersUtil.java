package ru.javawebinar.topjava.util;


import ru.javawebinar.topjava.model.User;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class UsersUtil {

    public static final List<User> USERS = Arrays.asList(
            new User(0, "FirstUser", "email", "pass", 2000, false, new HashSet<>()),
            new User(1, "SecondUser", "email2", "pass2", 2600, false, new HashSet<>())
    );
}