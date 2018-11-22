package hello.domain.book;

import hello.domain.user.User;

/**
 * @author hzwanghaijiang
 * @version 2018/11/22.
 */
public class Book {
    private int id;
    private String bookName;
    private User author;
    private float bookPrice;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public float getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(float bookPrice) {
        this.bookPrice = bookPrice;
    }
}
