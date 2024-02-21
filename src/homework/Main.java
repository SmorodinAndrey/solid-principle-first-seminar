package homework;

import homework.user.impl.User;

public class Main {
    public static void main(String[] args) {
        User user = new User("Bob");

        user.save();
        user.report();
    }
}