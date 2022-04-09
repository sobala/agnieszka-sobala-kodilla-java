package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {

    private final int userId;
    private final String username;
    private final char gender;
    private final LocalDate dayOfBirth;
    private final int numberOfPosts;

    public ForumUser(int userId, String username, char gender, LocalDate dayOfBirth, int numberOfPosts) {
        this.userId = userId;
        this.username = username;
        this.gender = gender;
        this.dayOfBirth = dayOfBirth;
        this.numberOfPosts = numberOfPosts;
    }

    public int getUserId() {
        return userId;
    }

    public String getUsername() {
        return username;
    }

    public char getGender() {
        return gender;
    }

    public LocalDate getDayOfBirth() {
        return dayOfBirth;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userId=" + userId +
                ", username='" + username + '\'' +
                ", gender=" + gender +
                ", dayOfBirth=" + dayOfBirth +
                ", numberOfPosts=" + numberOfPosts +
                '}';
    }
}
