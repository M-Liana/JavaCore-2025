package classwork.library;

import classwork.library.exception.AuthorNotFoundException;
import classwork.library.model.Author;
import classwork.library.model.Book;
import classwork.library.model.Role;
import classwork.library.model.User;
import classwork.library.storage.AuthorStorage;
import classwork.library.storage.BookStorage;
import classwork.library.storage.UserStorage;
import classwork.library.util.FileUtil;

import java.util.Date;
import java.util.List;
import java.util.Scanner;


public class LibraryDemo implements Commands {
    private static Scanner scanner = new Scanner(System.in);
    private static BookStorage bookStorage = FileUtil.deserializeBookStorage();
    private static AuthorStorage authorStorage = FileUtil.deserializeAuthorStorage();
    private static UserStorage userStorage = FileUtil.deserializeUserStorage();
    private static User currentUser = null;

    public static void main(String[] args) {
        boolean isRun = true;
        while (isRun) {
            Commands.printCommands();
            String command = scanner.nextLine();
            switch (command) {
                case EXIT:
                    isRun = false;
                    break;
                case LOGIN:
                    login();
                    break;
                case REGISTER:
                    register();
                    break;


                default:
                    System.err.println("wrong command  !  TRY AGAIN");
            }

        }
    }

    private static void register() {
        System.out.println(" Please input name, surname,email, password");
        String userData = scanner.nextLine();
        String[] userDataArr = userData.split(",");
        String name = userDataArr[0];
        String surname = userDataArr[1];
        String email = userDataArr[2];
        String password = userDataArr[3];
        if (userStorage.getUserByEmail(email) == null) {
            userStorage.register(new User(name, surname, email, password, Role.USER));
            FileUtil.serializeUserData(userStorage);
            System.out.println(" User registered successfully !!");

        } else {
            System.err.println("please choose another email !");
        }


    }

    private static void login() {
        System.out.println("Please input email, password !");
        String loginPasswordStr = scanner.nextLine();
        String[] loginPasswordArr = loginPasswordStr.split(",");
        String login = loginPasswordArr[0];
        String password = loginPasswordArr[1];
        User userByEmail = userStorage.getUserByEmail(login);
        if (userByEmail != null && userByEmail.getPassword().equals(password)) {
            System.out.println(" Welcome " + userByEmail.getName());
            currentUser = userByEmail;
            if (userByEmail.getRole()==Role.ADMIN){
                adminLogin();
            }else {
            userLogin();
            }
        } else {
            System.out.println("invalid User name or password");
        }
    }

    private static void adminLogin() { boolean isRun = true;
        while (isRun) {
            Commands.printAdminCommands();
            String command = scanner.nextLine();
            switch (command) {
                case LOGOUT:
                    currentUser = null;
                    isRun = false;
                    break;
                case ADD_AUTHOR:
                    addAuthor();
                    FileUtil.serializeAuthorData(authorStorage);
                    break;
                case ADD_BOOK:
                    addBook();
                    FileUtil.serializeBookData(bookStorage);
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
                case PRINT_ALL_USER:
                    userStorage.printAllUsers();
                    break;
                case REMOVE_USER_BY_EMAIL:
                    removeUserByEmail();
                    break;
                default:
                    System.err.println("wrong command  !  TRY AGAIN");
            }

        }




    }

    private static void removeUserByEmail() {
        userStorage.printAllUsers();
        System.out.println("Please input user's email");
        String userEmail = scanner.nextLine();
        if (userStorage.getUserByEmail(userEmail)!= null){
            userStorage.removeByEmail(userEmail);
            FileUtil.serializeUserData(userStorage);
            System.out.println("User removed");
        }else {
            System.out.println("User "+ userEmail+" does not exist!!! ");
        }
    }

    private static void userLogin() {
        boolean isRun = true;
        while (isRun) {
            Commands.printUserCommands();
            String command = scanner.nextLine();
            switch (command) {
                case LOGOUT:
                    currentUser = null;
                    isRun = false;
                    break;
                case ADD_AUTHOR:
                    addAuthor();
                    FileUtil.serializeAuthorData(authorStorage);
                    break;
                case ADD_BOOK:
                    addBook();
                    FileUtil.serializeBookData(bookStorage);
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

        try {
            Author author = authorStorage.getAuthorByPhoneNumber(phoneNumber);
            List<Book> books = bookStorage.searchBookByAuthor(author);

            for (Book book : books) {
                System.out.println(book);
//                    System.out.println("book is not founded");
//                    return;
//                } else {
//
            }


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

            System.out.println("Please input books' price");
            double price = Double.parseDouble(scanner.nextLine());
            System.out.println("please input book's id");
            String bookId = scanner.nextLine();
            System.out.println("quantity of books");
            int quantity = Integer.parseInt(scanner.nextLine());
            Date date = new Date();
            User courrentUser = new User();

            Book book = new Book(bookTitle, author, price, bookId, quantity, date,courrentUser);
            bookStorage.add(book);
            System.out.println("book added successfully");

        } catch (AuthorNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }


}
