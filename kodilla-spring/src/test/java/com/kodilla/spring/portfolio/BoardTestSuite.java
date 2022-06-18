package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class BoardTestSuite {

    @Autowired
    private Board board;

    @Test
    void testTaskAdd() {
        //Given
        //When
        board.toDoList.add("Call the manager.");
        board.inProgressList.add("Read a book.");
        board.doneList.add("Make a coffee.");
        //Then
        assertTrue(board.toDoList.tasks.contains("Call the manager."));
        assertTrue(board.inProgressList.tasks.contains("Read a book."));
        assertTrue(board.doneList.tasks.contains("Make a coffee."));
    }
}
