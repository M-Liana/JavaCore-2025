package classwork.library;

public interface Commands {
    String EXIT = "0";
    String ADD_AUTHOR = "1";
    String ADD_BOOK = "2";
    String PRINT_ALL_AUTHORS = "3";
    String PRINT_ALL_BOOKS = "4";
    String SEARCH_BOOK_BY_TITLE = "5";
    String SEARCH_BOOK_BY_AUTHOR = "6";
    String PRINT_EXPENSIVE_BOOK = "7";
    String DELETE_BOOK_BY_ID = "8";
    String SEARCH_BOOK_BY_PRICE = "9";


    static void printCommands() {
        System.out.println("please input " + EXIT + " for EXIT");
        System.out.println("please input " + ADD_AUTHOR + " for ADD AUTHOR");
        System.out.println("please input " + ADD_BOOK + " for ADD BOOK");
        System.out.println("please input " + PRINT_ALL_AUTHORS + " for PRINT ALL AUTHORS ");
        System.out.println("please input " + PRINT_ALL_BOOKS + " for PRINT ALL BOOKS ");
        System.out.println("please input " + SEARCH_BOOK_BY_TITLE + " for SEARCH BOOK BY TITLE ");
        System.out.println("please input " + SEARCH_BOOK_BY_AUTHOR + " for SEARCH BOOK BY AUTHOR ");
        System.out.println("please input " + PRINT_EXPENSIVE_BOOK + " for PRINT EXPENSIVE BOOK ");
        System.out.println("please input " + DELETE_BOOK_BY_ID + " for DELETE BOOK BY ID");
        System.out.println("please input " + SEARCH_BOOK_BY_PRICE + " for SEARCH BOOK BY PRICE  ");


    }
}
