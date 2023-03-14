package org.lessons.java.library;

import java.util.Scanner;

public class Summary {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Benvenuto nella tua libreria!");
        System.out.println("******");
        System.out.print("Quanti libri vuoi inserire? ");
        int dimension = Integer.parseInt(scanner.nextLine());

        Book[] books = new Book[dimension];

        for (int i = 0; i < dimension; i++) {
            System.out.print("Titolo: ");
            String title = scanner.nextLine();
            System.out.print("Numero pagine: ");
            int pageNumber = Integer.parseInt(scanner.nextLine());
            System.out.print("Autore: ");
            String author = scanner.nextLine();
            System.out.print("Editore: ");
            String editor = scanner.nextLine();
            try {
                books[i] = new Book(title, pageNumber, author, editor);
            } catch (IllegalArgumentException e) {
                throw new RuntimeException(e);
            }
        }

        for (int i = 0; i < books.length; i++) {
            System.out.println("*******");
            System.out.println(books[i]);
        }


    }
}
