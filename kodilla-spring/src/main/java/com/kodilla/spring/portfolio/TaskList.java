package com.kodilla.spring.portfolio;

import java.util.ArrayList;
import java.util.List;

public class TaskList {

    List<String> tasks;

    public TaskList() {
        this.tasks = new ArrayList<>();
    }

    public void add(String task) {
        this.tasks.add(task);
    }
}
