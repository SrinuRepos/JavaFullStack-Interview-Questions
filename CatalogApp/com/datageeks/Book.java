package com.datageeks;

import sun.text.bidi.BidiLine;


import java.util.Date;

public class Book extends  Item {
    private String author;
    private Date releaseDate;

    public Book()
    {

    }

    public Book(Integer id, String name, Float price, String author, Date releaseDate) {
        super(id, name, price);
        this.author = author;
        this.releaseDate = releaseDate;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    @Override
    public int hashCode()
    {
        return getId();
    }

    @Override
    public boolean equals(Object obj)
    {
        Book b = (Book)obj;
       return  this.getId().equals(b.getId()) &&
               this.getName().equals(b.getName()) &&
               this.getAuthor().equals(b.getAuthor());
    }

    @Override
    public String toString() {
        return super.toString()+"Book{" +
                "author='" + author + '\'' +
                ", releaseDate=" + releaseDate +
                '}';
    }
}
