package org.lessons.java.library;

public class Book {
    //ATTRIBUTI
    private String title;
    private int pageNumber;
    private String author;
    private String editor;

    //COSTRUTTORI

    public Book(String title, int pageNumber, String author, String editor) throws IllegalArgumentException {

        isEmptyTitle(title);
        this.title = title;
        positiveNumberOfPage(pageNumber);
        this.pageNumber = pageNumber;
        isEmptyAuthor(author);
        this.author = author;
        isEmptyEditor(editor);
        this.editor = editor;
    }

    //SETTER E GETTER

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) throws IllegalArgumentException{
        isEmptyTitle(title);
        this.title = title;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) throws IllegalArgumentException{
        positiveNumberOfPage(pageNumber);
        this.pageNumber = pageNumber;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        isEmptyAuthor(author);
        this.author = author;
    }

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        isEmptyEditor(editor);
        this.editor = editor;
    }

    //METODI
    private void isEmptyTitle(String title) throws IllegalArgumentException{
        if (title.isEmpty()){
            throw new IllegalArgumentException("Il campo titolo non può essere vuoto.");
        }
    }

    private void positiveNumberOfPage(int pageNumber) throws IllegalArgumentException{
        if (pageNumber <= 0) {
            throw new IllegalArgumentException("Il numero di pagine deve essere superiore di 0.");
        }
    }

    private void isEmptyAuthor(String author) throws IllegalArgumentException{
        if (author.isEmpty()){
            throw new IllegalArgumentException("Il campo autore non può essere vuoto.");
        }
    }

    private void isEmptyEditor(String editor) throws IllegalArgumentException{
        if (editor.isEmpty()){
            throw new IllegalArgumentException("Il campo editor non può essere vuoto.");
        }
    }

    @Override
    public String toString() {
        return "Titolo: " + title + "\n" +
                "Numero Pagine: " + pageNumber + "\n" +
                "Autore: " + author + "\n" +
                "Editore: " + editor;
    }
}
