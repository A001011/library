package com.example.library.entities;

import javax.persistence.*;
import java.util.Objects;

@Table(name = "Vote")
@Entity
public class Vote {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column
    private int value;
    @Column
    private String username;
    @Column
    private long bookId;

    public Vote() {

    }

    public Vote(int value, String username, long bookId) {
        this.value = value;
        this.username = username;
        this.bookId = bookId;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public long getBookId() {
        return bookId;
    }

    public void setBookId(long bookId) {
        this.bookId = bookId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vote vote = (Vote) o;
        return id == vote.id &&
                value == vote.value &&
                bookId == vote.bookId &&
                Objects.equals(username, vote.username);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, value, username, bookId);
    }

    @Override
    public String toString() {
        return "Vote{" +
                "id=" + id +
                ", value=" + value +
                ", username='" + username + '\'' +
                ", bookId=" + bookId +
                '}';
    }
}
