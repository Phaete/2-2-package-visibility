package com.phaete;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class LibraryTest {

    @Test
    void addBook() {
        Book[] books = new Book[] {
                new Book("Harry Potter and the Sorcerer's Stone", "J.K. Rowling", "978-0590353403"),
                new Book("The Hunger Games", "Suzanne Collins", "978-0439023481")
        };
        Library library = new Library(books);

        library.addBook(new Book("The Midnight Library", "Matt Haig", "978-1786892720"));
        assertEquals(3, library.getBooks().length);
    }

    @Test
    void removeBook() {
        Book[] books = new Book[] {
                new Book("Harry Potter and the Sorcerer's Stone", "J.K. Rowling", "978-0590353403"),
                new Book("The Hunger Games", "Suzanne Collins", "978-0439023481")
        };
        Library library = new Library(books);

        library.removeBook(library.getBookByIsbn("978-0590353403"));
        assertEquals(1, library.getBooks().length);
    }

    @Test
    void getBookByIsbn() {
        Book[] books = new Book[]{
                new Book("Harry Potter and the Sorcerer's Stone", "J.K. Rowling", "978-0590353403"),
                new Book("The Hunger Games", "Suzanne Collins", "978-0439023481")
        };
        Library library = new Library(books);

        assertEquals("Harry Potter and the Sorcerer's Stone", library.getBookByIsbn("978-0590353403").getTitle());
    }
}