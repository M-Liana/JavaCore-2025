package classwork.library.storage;

import classwork.library.model.Author;
import classwork.library.model.Book;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
;

public class BookStorage implements Serializable {
    private List<Book> books = new ArrayList<>();
    int size = 0;


    public void add(Book book) {
        books.add(book);
    }

    public void print() {
        for (Book book : books) {
            System.out.println(book);

        }
    }

    public void search(String keyword) {
        for (Book book : books) {
            if (book.getTitle().toLowerCase().contains(keyword.toLowerCase()) ){
                System.out.println(book);
            }

        }
    }


    public void searchBookByPriceRange(double min, double max) {

        boolean found = false;
        for (Book book : books) {
            double price = book.getPrice();
            if (price >= min && price <= max) {
                System.out.println(book);
                found = true;
            }
            if (!found) {
                System.out.println("No books found in price range " + min + " - " + max);
            }
        }


//        for (int i = 0; i < size; i++) {
//            double price = books[i].getPrice();
//            if (price >= min && price <= max) {
//                System.out.println(books[i]);
//                found = true;
//
//            }
//        }
//        if (!found) {
//            System.out.println("No books found in price range " + min + " - " + max);
//        }
    }


    public Book getBookByMaxPrice() {
        double price = 0;
        Book result = null;
        for (Book book : books) {
            if (book.getPrice() > price) {
                result = book;
            }

        }
        return result;
    }

    public void deleteBookById(String bookId) {


        int indexById = getIndexById(bookId);
        if (indexById == -1) {
            System.out.println("book does not exist ");
            return;

        }
        books.remove(bookId);
//        for (int i = indexById; i < size - 1; i++) {
//            books[i] = books[i + 1];
//        }
//        size--;
    }

    private int getIndexById(String bookId) {

        for (Book book : books) {
            if (book.getId().equals(bookId)) {
                System.out.println(book);
            }

        }

        return -1;
    }

    public List<Book> searchBookByAuthor(Author author) {
        for (Book book : books) {
            if (book.getAuthor().equals(author)) {
                System.out.println(book);
            }

        }

        return null;
    }
}
