package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Statistics Test Suite")
@ExtendWith(MockitoExtension.class)
public class StatisticsTestSuite {

    @Mock
    private Statistics statisticsMock;

    @Test
    void testCalculateAdvStatisticsWhenNoPosts() {
        //Given
        ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);
        List<String> listOfNames = new ArrayList<>();
        listOfNames.add("Tom");
        listOfNames.add("Alicia");
        listOfNames.add("Derek");
        when(statisticsMock.usersNames()).thenReturn(listOfNames);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(23457);

        //When
        forumStatistics.calculateAdvStatistics();

        //Then
        assertEquals(listOfNames.size(), forumStatistics.getNumberOfUsers());
        assertEquals(0, forumStatistics.getNumberOfPosts());
        assertEquals(23457, forumStatistics.getNumberOfComments());
        assertEquals(0, forumStatistics.getAvgNOfPostsPerUser());
        assertEquals(7819, forumStatistics.getAvgNOfCommentsPerUser());
        assertEquals(0, forumStatistics.getAvgNOfCommentsPerPost());
    }

    @Test
    void testCalculateAdvStatisticsWhen1000Posts() {
        //Given
        ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);
        List<String> listOfNames = new ArrayList<>();
        listOfNames.add("Tom");
        listOfNames.add("Alicia");
        when(statisticsMock.usersNames()).thenReturn(listOfNames);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(3000);

        //When
        forumStatistics.calculateAdvStatistics();

        //Then
        assertEquals(listOfNames.size(), forumStatistics.getNumberOfUsers());
        assertEquals(1000, forumStatistics.getNumberOfPosts());
        assertEquals(3000, forumStatistics.getNumberOfComments());
        assertEquals(500, forumStatistics.getAvgNOfPostsPerUser());
        assertEquals(1500, forumStatistics.getAvgNOfCommentsPerUser());
        assertEquals(3, forumStatistics.getAvgNOfCommentsPerPost());
    }

    @Test
    void testCalculateAdvStatisticsWhenNoComments() {
        //Given
        ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);
        List<String> listOfNames = new ArrayList<>();
        listOfNames.add("Tom");
        listOfNames.add("Alicia");
        when(statisticsMock.usersNames()).thenReturn(listOfNames);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(0);

        //When
        forumStatistics.calculateAdvStatistics();

        //Then
        assertEquals(listOfNames.size(), forumStatistics.getNumberOfUsers());
        assertEquals(1000, forumStatistics.getNumberOfPosts());
        assertEquals(0, forumStatistics.getNumberOfComments());
        assertEquals(500, forumStatistics.getAvgNOfPostsPerUser());
        assertEquals(0, forumStatistics.getAvgNOfCommentsPerUser());
        assertEquals(0, forumStatistics.getAvgNOfCommentsPerPost());
    }

    @Test
    void testCalculateAdvStatisticsWhenLessCommentsThanPosts() {
        //Given
        ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);
        List<String> listOfNames = new ArrayList<>();
        listOfNames.add("Tom");
        listOfNames.add("Alicia");
        when(statisticsMock.usersNames()).thenReturn(listOfNames);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(500);

        //When
        forumStatistics.calculateAdvStatistics();

        //Then
        assertEquals(listOfNames.size(), forumStatistics.getNumberOfUsers());
        assertEquals(1000, forumStatistics.getNumberOfPosts());
        assertEquals(500, forumStatistics.getNumberOfComments());
        assertEquals(500, forumStatistics.getAvgNOfPostsPerUser());
        assertEquals(250, forumStatistics.getAvgNOfCommentsPerUser());
        assertEquals(0.5, forumStatistics.getAvgNOfCommentsPerPost());
    }

    @Test
    void testCalculateAdvStatisticsWhenMoreCommentsThanPosts() {
        //Given
        ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);
        List<String> listOfNames = new ArrayList<>();
        listOfNames.add("Tom");
        listOfNames.add("Alicia");
        when(statisticsMock.usersNames()).thenReturn(listOfNames);
        when(statisticsMock.postsCount()).thenReturn(500);
        when(statisticsMock.commentsCount()).thenReturn(1000);

        //When
        forumStatistics.calculateAdvStatistics();

        //Then
        assertEquals(listOfNames.size(), forumStatistics.getNumberOfUsers());
        assertEquals(500, forumStatistics.getNumberOfPosts());
        assertEquals(1000, forumStatistics.getNumberOfComments());
        assertEquals(250, forumStatistics.getAvgNOfPostsPerUser());
        assertEquals(500, forumStatistics.getAvgNOfCommentsPerUser());
        assertEquals(2, forumStatistics.getAvgNOfCommentsPerPost());
    }

    @Test
    void testCalculateAdvStatisticsWhenNoUsers() {
        //Given
        ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);
        List<String> listOfNames = new ArrayList<>();
        when(statisticsMock.usersNames()).thenReturn(listOfNames);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(500);

        //When
        forumStatistics.calculateAdvStatistics();

        //Then
        assertEquals(listOfNames.size(), forumStatistics.getNumberOfUsers());
        assertEquals(1000, forumStatistics.getNumberOfPosts());
        assertEquals(500, forumStatistics.getNumberOfComments());
        assertEquals(0, forumStatistics.getAvgNOfPostsPerUser());
        assertEquals(0, forumStatistics.getAvgNOfCommentsPerUser());
        assertEquals(0.5, forumStatistics.getAvgNOfCommentsPerPost());
    }

    @Test
    void testCalculateAdvStatisticsWhen100Users() {
        //Given
        ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);
        List<String> listOfNames = new ArrayList<>();
        for(int i = 1; i <= 100; i++) {
            listOfNames.add("User " + i);
        }
        when(statisticsMock.usersNames()).thenReturn(listOfNames);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(500);

        //When
        forumStatistics.calculateAdvStatistics();

        //Then
        assertEquals(listOfNames.size(), forumStatistics.getNumberOfUsers());
        assertEquals(1000, forumStatistics.getNumberOfPosts());
        assertEquals(500, forumStatistics.getNumberOfComments());
        assertEquals(10, forumStatistics.getAvgNOfPostsPerUser());
        assertEquals(5, forumStatistics.getAvgNOfCommentsPerUser());
        assertEquals(0.5, forumStatistics.getAvgNOfCommentsPerPost());
    }
}
