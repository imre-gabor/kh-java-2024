package com.khb.hu.javacourse.javafeatures;

import java.io.Serializable;

public record Book(@MyAnnotation String title, String author, String isbn, Chapter sampleChapter) implements Titled, Serializable {

    public /*static*/ record Chapter(String title, int pages) implements Titled{

    }

    //private int price; --> tilos
    private static int MAX_PRICE = 20000;

    //explicit kanonikus konstruktor
//    public Book(String title, String author, String isbn) {
//        this.title = title;
//        this.author = author == null ? "Unknown" : author;
//        this.isbn = isbn;
//    }

    //compact canonical constructor
    public Book {
        if(author == null)
            //this.author = "Unknown"; --> nem fordul
            author = "Unknown";

        //System.out.println(this.author); --> nem fordul
    }
    //utána a default this.x=x-ek meghívódnak

    public Book() {
        this(null);
    }

    public Book(String title) {
        this(title, null, null, null);
    }

    @Override
    public String toString(){
        return "Book[%s, %s, %s]".formatted(this.title, this.author, this.isbn);
    }

    public void m() {
    }

    public static void m2() {}
}
