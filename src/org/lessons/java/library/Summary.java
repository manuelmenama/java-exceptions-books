package org.lessons.java.library;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Summary {
    private final static String FILE_PATH = "./list_of_books.txt";

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
                e.printStackTrace();
            }
        }

        scanner.close();

        System.out.println(Arrays.toString(books));

        //stampa degli elementi dell'array sul file
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(FILE_PATH, true);
            for (Book thisBook :
                 books) {
                fileWriter.write(thisBook.toString() + "\n" + "-------------" + "\n");
            }
        } catch (IOException e) {
            System.out.println("Impossibile creare file.");
            System.out.println(e.getMessage());
        } finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        //lettura dal file e stampa
        Scanner fileScanner = null;
        try {
            fileScanner = new Scanner(new File(FILE_PATH));
            while (fileScanner.hasNext()){
                String line = fileScanner.nextLine();
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                fileScanner.close();
            } catch (IllegalStateException e) {
                e.printStackTrace();
            }
        }

    }
}
