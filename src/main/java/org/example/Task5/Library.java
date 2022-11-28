package org.example.Task5;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Library {

    public static void main(String[] args) {
        List<Book> books = Book.getBookList(10);

//        System.out.println("Books");
//        books.stream().forEach(System.out::println);

//        System.out.println("Book names:");
//        books.stream().map(Book::getName).forEach(System.out::println);

//        System.out.println("Total price: " + books.stream().mapToInt(Book::getPrice).sum());

//        System.out.println("Book names starting with A:");
//        books.stream().map(Book::getName).filter(name -> name.startsWith("A") || name.startsWith("a")).forEach(System.out::println);

//        System.out.println("Book with highest price: " + books.stream().max(Comparator.comparing(Book::getPrice)).get().getName());

//        System.out.println("Number of books with 5 letter names: " + books.stream().filter(book -> book.getName().length() == 5).count());

//        System.out.println("Books with prices below 30:");
//        books.stream().filter(book -> book.getPrice() <= 30).forEach(System.out::println);

//        System.out.println("Boos sorted:");
//        books.stream().sorted(Collections(Comparator.reverseOrder()))

        Book book1 = new Book("Harry Potter", 5);
        Book book2 = new Book("Harry Potter", 5);

        Map<Book, String> mapWithBook = new HashMap<>();
        mapWithBook.put(book1, "Washington");
        System.out.println(mapWithBook.get(book2));
    }
}
