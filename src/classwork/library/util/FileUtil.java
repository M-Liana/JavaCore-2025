package classwork.library.util;

import classwork.library.storage.AuthorStorage;
import classwork.library.storage.BookStorage;
import classwork.library.storage.UserStorage;

import java.io.*;

public abstract class FileUtil {

    private static final String BOOK_DATA_FILE =
            "C:\\Users\\user\\IdeaProjects\\JavaCore-2025\\src\\classwork\\library\\data\\bookData.data";
    private static final String AUTHOR_DATA_FILE =
            "C:\\Users\\user\\IdeaProjects\\JavaCore-2025\\src\\classwork\\library\\data\\authorData.data";
    private static final String USER_DATA_FILE =
            "C:\\Users\\user\\IdeaProjects\\JavaCore-2025\\src\\classwork\\library\\data\\userData.data";

    // ================= BOOK =================

    public static void serializeBookData(BookStorage bookStorage) {
        try (ObjectOutputStream oos =
                     new ObjectOutputStream(new FileOutputStream(BOOK_DATA_FILE))) {

            oos.writeObject(bookStorage); // ✅ FIX

        } catch (FileNotFoundException e) {
            System.out.println("File not found Book Data " + e);
        } catch (IOException e) {
            System.out.println("Failed to Serialize Book Data " + e);
        }
    }

    public static BookStorage deserializeBookStorage() {
        try (ObjectInputStream ois =
                     new ObjectInputStream(new FileInputStream(BOOK_DATA_FILE))) {

            Object obj = ois.readObject();
            if (obj instanceof BookStorage bookStorage) {
                return bookStorage;
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found Book Data " + e);
        } catch (EOFException e) {
            System.out.println("Book Data file is empty");
        } catch (IOException e) {
            System.out.println("Failed to Deserialize Book Data " + e);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return new BookStorage();
    }

    // ================= AUTHOR =================

    public static void serializeAuthorData(AuthorStorage authorStorage) {
        try (ObjectOutputStream oos =
                     new ObjectOutputStream(new FileOutputStream(AUTHOR_DATA_FILE))) {

            oos.writeObject(authorStorage); // ✅ FIX

        } catch (FileNotFoundException e) {
            System.out.println("File not found Author Data " + e);
        } catch (IOException e) {
            System.out.println("Failed to Serialize Author Data " + e);
        }
    }

    public static AuthorStorage deserializeAuthorStorage() {
        try (ObjectInputStream ois =
                     new ObjectInputStream(new FileInputStream(AUTHOR_DATA_FILE))) {

            Object obj = ois.readObject();
            if (obj instanceof AuthorStorage authorStorage) {
                return authorStorage;
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found Author Data " + e);
        } catch (EOFException e) {
            System.out.println("Author Data file is empty");
        } catch (IOException e) {
            System.out.println("Failed to Deserialize Author Data " + e);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return new AuthorStorage();
    }

    // ================= USER =================

    public static void serializeUserData(UserStorage userStorage) {
        try (ObjectOutputStream oos =
                     new ObjectOutputStream(new FileOutputStream(USER_DATA_FILE))) {

            oos.writeObject(userStorage); // ✅ FIX

        } catch (FileNotFoundException e) {
            System.out.println("File not found USER DATA " + e);
        } catch (IOException e) {
            System.out.println("Failed to Serialize User Data " + e);
        }
    }

    public static UserStorage deserializeUserStorage() {
        try (ObjectInputStream ois =
                     new ObjectInputStream(new FileInputStream(USER_DATA_FILE))) {

            Object obj = ois.readObject();
            if (obj instanceof UserStorage userStorage) {
                return userStorage;
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found User Data");
        } catch (EOFException e) {
            System.out.println("User Data file is empty");
        } catch (IOException e) {
            System.out.println("Failed to Deserialize User Data");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return new UserStorage();
    }
}
