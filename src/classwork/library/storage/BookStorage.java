package classwork.library.storage;

import classwork.library.model.Author;
import classwork.library.model.Book;

public class BookStorage {
    Book[] books = new Book[10];
    int size = 0;


    public void add(Book book) {
        if (size == books.length) {
            extend();
        }
        books[size++] = book;
    }

    private void extend() {
        Book[] tmp = new Book[size + 10];
        System.arraycopy(books, 0, tmp, 0, size);
        books = tmp;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(books[i]);
        }
    }

    public void search(String keyword) {
        for (int i = 0; i < size; i++) {
            if (books[i].getTitle().toLowerCase().contains(keyword.toLowerCase())) {
                System.out.println(books[i]);
            }
        }
    }


    public void searchBookByPriceRange(double min, double max) {
        boolean found = false;
        for (int i = 0; i < size; i++) {
            double price = books[i].getPrice();
            if (price >= min && price <= max) {
                System.out.println(books[i]);
                found = true;

            }
        }
        if (!found) {
            System.out.println("No books found in price range " + min + " - " + max);
        }
    }


    public Book getBookByMaxPrice() {
        double price = 0;
        int maxIndex = -1;
        for (int i = 0; i < size; i++) {
            if (books[i].getPrice() > price) {
                price = books[i].getPrice();
                maxIndex = i;
            }

        }
        return books[maxIndex];
    }

    public void deleteBookById(String bookId) {
        int indexById = getIndexById(bookId);
        if (indexById == -1) {
            System.out.println("book does not exist ");
            return;

        }
        for (int i = indexById; i < size - 1; i++) {
            books[i] = books[i + 1];
        }
        size--;
    }

    private int getIndexById(String bookId) {
        for (int i = 0; i < size; i++) {
            if (books[i].getId().equals(bookId)) {
                return i;
            }

        }
        return -1;
    }

    public void searchBookByAuthor(Author author) {
        for (int i = 0; i < size; i++) {
            if (books[i].getAuthor().equals(author)) {
                System.out.println(books[i]);
            }

        }
    }
}
