package org.example.Task5;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;

import java.util.ArrayList;
import java.util.List;

public class Book {

    private String name;
    private Integer price;

    public Book(String name, Integer price) {
        this.name = name;
        this.price = price;
    }

    public static List<Book> getBookList(Integer quantity) {
        List<Book> bookList = new ArrayList<>();
        for (int i = 0; i < quantity; i++) {
            bookList.add(new Book(RandomStringUtils.randomAlphabetic(3, 10), RandomUtils.nextInt(1, 99)));
        }
        return bookList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", price=" + price;
    }
}
