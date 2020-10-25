import java.util.ArrayList;

public class Library {
    private ArrayList<Book> library;

    public Library() {
        library = new ArrayList<Book>();
    }

    public void add(Book book) {
        library.add(book);
    }

    public Book get(int id) {
        return library.get(id);
    }

    public ArrayList<Book> filterByAuthor(String author) {
        ArrayList<Book> books = new ArrayList<Book>();
        for (Book book : library) {
            if (book.getAuthor() == author) books.add(book);
        }
        return books;
    }

    public ArrayList<Book> filterByPublisher(String publisher) {
        ArrayList<Book> books = new ArrayList<Book>();
        for (Book book : library) {
            if (book.getPublisher() == publisher) books.add(book);
        }
        return books;
    }

    public ArrayList<Book> filterByYear(int year) {
        ArrayList<Book> books = new ArrayList<Book>();
        for (Book book : library) {
            if (book.getYear() >= year) books.add(book);
        }
        return books;
    }
}
