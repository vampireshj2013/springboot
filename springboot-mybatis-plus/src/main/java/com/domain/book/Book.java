package com.domain.book;

import org.apache.ibatis.type.Alias;

/**
 * @author hzwanghaijiang
 * @version 2018/11/22.
 */
@Alias("Book")
public class Book {
    private int id;
    private String bookName;
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

    public float getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(float bookPrice) {
        this.bookPrice = bookPrice;
    }
}
