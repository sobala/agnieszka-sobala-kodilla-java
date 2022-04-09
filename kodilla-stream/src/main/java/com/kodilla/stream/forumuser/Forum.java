package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> listOfUsers = new ArrayList<>();

    public Forum() {
        listOfUsers.add(new ForumUser(34958, "knight23", 'M', LocalDate.of(1999,4,24), 34));
        listOfUsers.add(new ForumUser(34959, "prince23", 'M', LocalDate.of(1994, 3,4), 134));
        listOfUsers.add(new ForumUser(34308, "king23", 'F', LocalDate.of(1977,2,14), 30));
        listOfUsers.add(new ForumUser(34960, "queen23", 'M', LocalDate.of(1969,1,26), 4));
        listOfUsers.add(new ForumUser(14958, "witch23", 'F', LocalDate.of(1979,4,27), 64));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(listOfUsers);
    }
}
