package com.company.oop.accessModifier;

public class Book {
    private final String title;
    private final int pageNumbers;

    public Book(String title, int pageNumbers) {
        this.title = title;
        this.pageNumbers = pageNumbers;
    }

    public String getTitle() {
        return title;
    }

    public int getPageNumbers() {
        return pageNumbers;
    }

    public static void main(String[] args) {
        Book myBook = new Book("Calculus",200);

    }
}
