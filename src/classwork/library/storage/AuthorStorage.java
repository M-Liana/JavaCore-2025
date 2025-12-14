package classwork.library.storage;

import classwork.library.exception.AuthorNotFoundException;
import classwork.library.model.Author;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class AuthorStorage implements Serializable {

  List<Author>authors= new LinkedList<>();



    public void addAuthor(Author author) {
      authors.add(author);
    }

    public void print() {
        for (Author author : authors) {
            System.out.println(author);

        }
    }

    public Author getAuthorByPhoneNumber(String phoneNumber) throws AuthorNotFoundException {
        for (Author author : authors) {
            if (author.getPhoneNumber().equals(phoneNumber)){
               return author;
            }

        }
       throw  new  AuthorNotFoundException("author with "+ phoneNumber+" does not exist");
    }


}
