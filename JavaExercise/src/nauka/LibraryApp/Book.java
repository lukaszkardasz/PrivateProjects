package nauka.LibraryApp;

public class Book {
    String title;
    String author;
    int releaseDate;
    int pages;
    String publisher;
    String isbn;

    public Book(String bookTitle, String bookAuthor, int bookReleaseDate, int bookPages, String bookPublisher, String bookIsbn) {
        title = bookTitle;
        author = bookAuthor;
        releaseDate = bookReleaseDate;
        pages = bookPages;
        publisher = bookPublisher;
        isbn = bookIsbn;
    }
    void printInfo(){
        System.out.println(title + "; " + author + "; " + releaseDate + "; "
                + pages + "; " + publisher + "; " + isbn);
    }
}
