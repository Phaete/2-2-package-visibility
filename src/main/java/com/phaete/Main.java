package com.phaete;

public class Main {
    public static void main(String[] args) {
        Book[] books = {
                new Book("Harry Potter and the Sorcerer's Stone", "J.K. Rowling", "978-0590353403"),
                new Book("The Hunger Games", "Suzanne Collins", "978-0439023481"),
                new Book("The Midnight Library", "Matt Haig", "978-1786892720"),
                new Book("Twilight", "Stephenie Meyer", "978-0316015844"),
                new Book("The Catcher in the Rye", "J.D. Salinger", "978-0316769530")
        };

        Library library = new Library(books);

        System.out.println("Library: " + library);

        library.addBook(new Book("The Hobbit", "J.R.R. Tolkien", "978-0553588486"));
        System.out.println("Library: " + library);

        library.removeBook(new Book("The Catcher in the Rye", "J.D. Salinger", "978-0316769530"));
        System.out.println("Library: " + library);
    }
}