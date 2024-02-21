package homework.user.impl;

import homework.user.SaveTable;
import homework.user.ReportTable;

public class User implements ReportTable, SaveTable {
    private final String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void report() {
        System.out.println("Report for user: " + name);
    }

    public void save() {
        System.out.println("Save user: " + name);
    }
}