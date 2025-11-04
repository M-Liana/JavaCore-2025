package classwork.library;

import classwork.library.exception.AuthorNotFoundException;
import classwork.library.model.Author;
import classwork.library.model.Book;
import classwork.library.storage.AuthorStorage;
import classwork.library.storage.BookStorage;

import java.awt.image.renderable.ContextualRenderedImageFactory;
import java.util.Scanner;


public class LibraryDemo implements Commands {
    private static Scanner scanner = new Scanner(System.in);
    private static BookStorage bookStorage = new BookStorage();
    private static AuthorStorage authorStorage = new AuthorStorage();


    public static void main(String[] args) {
        boolean isRun = true;
        while (isRun) {
            Commands.printCommands();
            String command = scanner.nextLine();
            switch (command) {
                case EXIT:
                    isRun = false;
                    break;
                case ADD_AUTHOR:
                    addAuthor();
                    break;
                case ADD_BOOK:
                    addBook();
                    break;
                case PRINT_ALL_AUTHORS:
                    authorStorage.print();
                    break;
                case PRINT_ALL_BOOKS:
                    bookStorage.print();
                    break;
                case SEARCH_BOOK_BY_AUTHOR:
                    searchBookByAuthor();
                    break;
                case SEARCH_BOOK_BY_TITLE:
                    System.out.println("please input keyword");
                    String keyword = scanner.nextLine();
                    bookStorage.search(keyword);
                    break;
                case PRINT_EXPENSIVE_BOOK:
                    System.out.println(bookStorage.getBookByMaxPrice());
                    break;
                case DELETE_BOOK_BY_ID:
                    System.out.println("please input book's  id");
                    String bookId = scanner.nextLine();
                    bookStorage.deleteBookById(bookId);
                    break;
                case SEARCH_BOOK_BY_PRICE:
                    System.out.println("please input  book price");
                    double price = Double.parseDouble(scanner.nextLine());
                    bookStorage.searchBookByPriceRange(100, 200);
                    break;
                default:
                    System.err.println("wrong command  !  TRY AGAIN");
            }

        }
    }

    private static void searchBookByAuthor() {
        System.out.println("Please choose Author by phoneNumber ");

        authorStorage.print();
        String phoneNumber = scanner.nextLine();
        Author author = null;
        try {
            author = authorStorage.getAuthorByPhoneNumber(phoneNumber);
        } catch (AuthorNotFoundException e) {
            System.out.println(e.getMessage());
        }


    }

    private static void addAuthor() {

        System.out.println("Please input author's name");
        String name = scanner.nextLine();
        System.out.println("please input authors' surname");
        String surname = scanner.nextLine();
        System.out.println("Please input author's age");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println(" Please input author's phoneNumber");
        String phoneNumber = scanner.nextLine();

        Author author = new Author(name, surname, age, phoneNumber);
        authorStorage.addAuthor(author);
        System.out.println("Author added successfully !");
    }

    private static void addBook() {
        System.out.println("Please choose Author by phoneNumber ");

        authorStorage.print();
        String phoneNumber = scanner.nextLine();

        Author author = null;
        try {
            author = authorStorage.getAuthorByPhoneNumber(phoneNumber);
            System.out.println("Please input book title");
            String bookTitle = scanner.nextLine();
            System.out.println("please input book's authorName");
            String authorName = scanner.nextLine();
            System.out.println("Please input books' price");
            double price = Double.parseDouble(scanner.nextLine());
            System.out.println("please input book's id");
            String bookId = scanner.nextLine();
            System.out.println("quantity of books");
            int quantity = Integer.parseInt(scanner.nextLine());

            Book book = new Book(bookTitle, author, price, bookId, quantity);
            bookStorage.add(book);
            System.out.println("book added successfully");

        } catch (AuthorNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }


}
