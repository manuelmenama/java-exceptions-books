package org.lessons.java.library;

public class Summary {
    public static void main(String[] args) {

        Book newBook = new Book("Melanzane alla Parmigiana", 100, "Mimmo", "Bompiani");

        newBook.setTitle("Melanzanine");

        newBook.setPageNumber(200);

        System.out.println(newBook);



    }
}
