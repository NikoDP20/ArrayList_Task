package codefinity;

import java.util.ArrayList;
import java.util.List;

public class Library {
    public List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBookById(int id) {
        List<Book> booksToRemove = new ArrayList<>();
        for (Book book : books) {
            if (book.getId() == id) {
                booksToRemove.add(book);
            }
        }
        books.removeAll(booksToRemove);
    }

    public List<Book> findBooksByAuthor(String author) {
        List<Book> bba = new ArrayList<>();
        for(Book b: books) {
            if (b.getAuthor().equals(author)) {
                bba.add(b);
            }
        }
        return bba;
    }

    public List<Book> findBooksPublishedAfterYear(int year) {
        List<Book> bby = new ArrayList<>();
        for(Book b: books) {
            if (b.getYear() > year) {
                bby.add(b);
            }
        }
        return bby;
    }

    public void displayAllBooks() {
        System.out.print(books + "\n");
    }
}
