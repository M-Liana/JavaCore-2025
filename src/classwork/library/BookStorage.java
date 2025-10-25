package classwork.library;

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


    public void searchBookByPrice(double price) {

        for (int i = 0; i < size; i++) {
            if (price > 100 && books[i].getPrice() > 100 && price<200 && books[i].getPrice() <200){
                System.out.println(books[i]);

            }
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
}
