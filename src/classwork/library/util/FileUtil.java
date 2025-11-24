package classwork.library.util;

import classwork.library.storage.AuthorStorage;
import classwork.library.storage.BookStorage;

import java.io.*;

public abstract class FileUtil {

    private static final String BOOK_DATA_FILE = "C:\\Users\\user\\IdeaProjects\\JavaCore-2025\\src\\classwork\\library\\data\\bookData.data";
    private static final String AUTHOR_DATA_FILE = "C:\\Users\\user\\IdeaProjects\\JavaCore-2025\\src\\classwork\\library\\data\\authorData.data";

    public static void serializeBookData(BookStorage bookStorage) {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(BOOK_DATA_FILE))) {
        } catch (FileNotFoundException e) {
            System.out.println("File not found Book Data" + e);
        } catch (IOException e) {
            System.out.println("Failed to Serialize Book Data" + e);
        }

    }

    public static void serializeAuthorData(AuthorStorage authorStorageStorage) {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(AUTHOR_DATA_FILE))) {
        } catch (FileNotFoundException e) {
            System.out.println("File not found Author Data" + e);
        } catch (IOException e) {
            System.out.println("Failed to Serialize Author Data" + e);
        }

    }

    public static AuthorStorage deserializeAuthorStorage() {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(AUTHOR_DATA_FILE))) {
            Object obj = objectInputStream.readObject();
            if (obj instanceof AuthorStorage authorStorage){
                return authorStorage;
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found Author Data" + e);
        } catch (IOException e) {
            System.out.println("Failed to Serialize Author Data" + e);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return new AuthorStorage();
    }

    public static BookStorage deserializeBookStorage() {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(BOOK_DATA_FILE))) {
            Object obj = objectInputStream.readObject();
            if (obj instanceof BookStorage bookStorage){
                return bookStorage;
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found Book Data" + e);
        } catch (IOException e) {
            System.out.println("Failed to Serialize Book Data" + e);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return new BookStorage();
    }

}
