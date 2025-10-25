package classwork.library;

import java.util.Scanner;


public class LibraryDemo implements Commands {
    private static Scanner scanner = new Scanner(System.in);
    private static BookStorage bookStorage = new BookStorage();


    public static void main(String[] args) {
        boolean isRun = true;
        while (isRun) {
            Commands.printCommands();
            String command = scanner.nextLine();
            switch (command) {
                case EXIT:
                    isRun = false;
                    break;
                case ADD_BOOK:
                    addBook();
                    break;
                case PRINT_ALL_BOOKS:
                    bookStorage.print();
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
                 double price  =Double.parseDouble(scanner.nextLine());
                 bookStorage.searchBookByPrice(price);
                 break;
                default:
                    System.err.println("wrong command  !  TRY AGAIN");
            }

        }
    }

    private static void addBook() {
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

        Book book = new Book(bookTitle,authorName,price,bookId,quantity);
        bookStorage.add(book);
        System.out.println("book added successfully");
    }


}
