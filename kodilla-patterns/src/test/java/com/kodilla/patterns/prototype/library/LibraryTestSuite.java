package com.kodilla.patterns.prototype.library;

import com.kodilla.patterns.prototype.Board;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;


public class LibraryTestSuite {

    @Test
    void testGetBooks() {
        //Given
        Library library = new Library("library1");
        Book book1 = new Book("Harry Potter 1", "J.K. Rowling", LocalDate.of(2003, 10, 12));
        Book book2 = new Book("Harry Potter 2", "J.K. Rowling", LocalDate.of(2004, 10, 12));
        library.books.add(book1);
        library.books.add(book2);

        //making a shallow copy
        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
        //making a deep copy
        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
        //When
        clonedLibrary.getBooks().remove(book1);
        //Then
        assertEquals(1, library.getBooks().size());
        assertEquals(1, clonedLibrary.getBooks().size());
        assertEquals(2, deepClonedLibrary.getBooks().size());
        assertEquals(clonedLibrary.getBooks(), library.getBooks());
        assertNotEquals(deepClonedLibrary.getBooks(), library.getBooks());

    }

}
