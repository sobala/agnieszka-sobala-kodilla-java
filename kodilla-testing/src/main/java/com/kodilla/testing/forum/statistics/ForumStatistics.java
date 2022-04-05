package com.kodilla.testing.forum.statistics;

public class ForumStatistics {

    private Statistics statistics;
    int numberOfUsers;
    int numberOfPosts;
    int numberOfComments;
    double avgNOfPostsPerUser;
    double avgNOfCommentsPerUser;
    double avgNOfCommentsPerPost;

    public ForumStatistics(Statistics statistics) {
        this.statistics = statistics;
    }

    public void calculateAdvStatistics() {
        this.numberOfUsers = statistics.usersNames().size();
        this.numberOfPosts = statistics.postsCount();
        this.numberOfComments = statistics.commentsCount();
        if(numberOfUsers == 0) {
            this.avgNOfPostsPerUser = 0;
            this.avgNOfCommentsPerUser = 0;
            this.avgNOfCommentsPerPost = (double) numberOfComments / numberOfPosts;
        } else if(numberOfPosts == 0) {
            this.avgNOfPostsPerUser = (double) numberOfPosts / numberOfUsers;
            this.avgNOfCommentsPerUser = (double) numberOfComments / numberOfUsers;
            this.avgNOfCommentsPerPost = 0;
        } else {
            this.avgNOfPostsPerUser = (double) numberOfPosts / numberOfUsers;
            this.avgNOfCommentsPerUser = (double) numberOfComments / numberOfUsers;
            this.avgNOfCommentsPerPost = (double) numberOfComments / numberOfPosts;
        }
    }

    public int getNumberOfUsers() {
        return numberOfUsers;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    public int getNumberOfComments() {
        return numberOfComments;
    }

    public double getAvgNOfPostsPerUser() {
        return avgNOfPostsPerUser;
    }

    public double getAvgNOfCommentsPerUser() {
        return avgNOfCommentsPerUser;
    }

    public double getAvgNOfCommentsPerPost() {
        return avgNOfCommentsPerPost;
    }
}
