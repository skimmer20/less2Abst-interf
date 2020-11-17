package com.lesson2;

/**
 * @author yuriismac on 2020-11-12.
 * @project lesson2_abstract_and_interface
 */
public class Book implements Printable {

    private int id;
    private String bookName;
    private String description;

    public Book(int id, String bookName, String description) {
        this.id = id;
        this.bookName = bookName;
        this.description = description;
    }

    Book(String bookName) {
        this.bookName = bookName;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", bookName='" + bookName + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    public static void printBooks(Printable[] printables){
       for (Printable valueOfArray: printables){
           if (valueOfArray instanceof Book){
               System.out.println(valueOfArray + "; \n-----------------------------------------------------");
           }
       }
    }

    @Override
    public void print() {
        System.out.printf("Книга №%s\nНазва книги: %s; \nОпис: %s;\n--------------------------------------\n\"",
                id, bookName, description);
    }
}
