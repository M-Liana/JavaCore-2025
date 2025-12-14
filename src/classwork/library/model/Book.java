package classwork.library.model;


import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class Book implements Serializable {
    private String title;
    private Author author;
    private double price;
    private String id;
    private int quantity;
    private Date createdDate;
    private  User user;

    public Book(String title, Author author, double price, String id, int quantity, Date createdDate,User user) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.id = id;
        this.quantity = quantity;
        this.createdDate = createdDate;
        this.user=user;
    }

    public Book() {
    }




    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Double.compare(price, book.price) == 0 && quantity == book.quantity && Objects.equals(title, book.title) && Objects.equals(author, book.author) && Objects.equals(id, book.id) && Objects.equals(createdDate, book.createdDate) && Objects.equals(user, book.user);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, price, id, quantity, createdDate, user);
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author=" + author +
                ", price=" + price +
                ", id='" + id + '\'' +
                ", quantity=" + quantity +
                ", createdDate=" + createdDate +
                ", user=" + user +
                '}';
    }
}