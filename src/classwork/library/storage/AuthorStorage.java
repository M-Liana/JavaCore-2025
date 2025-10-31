package classwork.library.storage;

import classwork.library.model.Author;
import classwork.library.model.Book;

public class AuthorStorage {

    Author[] authors = new Author[10];
    int size = 0;


    public void addAuthor(Author author) {
        if (size == authors.length) {
            extend();
        }
        authors[size++] = author;
    }

    private void extend() {
        Author[] tmp = new Author[size + 10];
        System.arraycopy(authors, 0, tmp, 0, size);
        authors = tmp;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(authors[i]);
        }
    }

    public Author getAuthorByPhoneNumber(String phoneNumber) {
        for (int i = 0; i < size; i++) {
            if (authors[i].getPhoneNumber().equals(phoneNumber)) {
                return authors[i];
            }

        }
        return null;
    }


}
