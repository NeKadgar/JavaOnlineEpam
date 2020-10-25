import java.util.ArrayList;

public class LibraryTest {
    public static void main(String[] args) {
        Book book1 = new Book("1984", "Orwell", "IDK", 1984, 200, 11.4, "thick binding");
        Book book2 = new Book("Modern Operating Systems", "Tanenbaum", "IDK", 2014, 1400, 39.99, "thick binding");
        Book book3 = new Book("Computer Networks (5th Edition)", "Tanenbaum", "IDK", 2010, 2500, 65.04, "thick binding");
        Library library = new Library();
        library.add(book1);
        library.add(book2);
        library.add(book3);
        ArrayList<Book> authorBooks = library.filterByAuthor("Tanenbaum");
        System.out.println("\nFilter by author:");
        for (Book book : authorBooks) System.out.println(book);
        System.out.println("\nFilter by year:");
        for (Book book : library.filterByYear(2011)) System.out.println(book);
        System.out.println("\nFilter by publisher:");
        for (Book book : library.filterByPublisher("IDK")) System.out.println(book);
    }
}