package com.example.library.entities;

import javax.persistence.*;
import java.util.Objects;

@Table(name = "Books")
@Entity

public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column
    private Author author;
    @Column
    private Genre genre;
    @Column
    private Publisher publisher;
    @Column
    private int publishyear;
    @Column
    private int rating;
    @Column
    private String description;

    public Book() {

    }

    public Book(Author author, Genre genre, Publisher publisher, int publishyear, int rating, String description) {
        this.author = author;
        this.genre = genre;
        this.publisher = publisher;
        this.publishyear = publishyear;
        this.rating = rating;
        this.description = description;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public int getPublishyear() {
        return publishyear;
    }

    public void setPublishyear(int publishyear) {
        this.publishyear = publishyear;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return id == book.id &&
                publishyear == book.publishyear &&
                rating == book.rating &&
                Objects.equals(author, book.author) &&
                Objects.equals(genre, book.genre) &&
                Objects.equals(publisher, book.publisher) &&
                Objects.equals(description, book.description);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, author, genre, publisher, publishyear, rating, description);
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", author=" + author +
                ", genre=" + genre +
                ", publisher=" + publisher +
                ", publishyear=" + publishyear +
                ", rating=" + rating +
                ", description='" + description + '\'' +
                '}';
    }
}
