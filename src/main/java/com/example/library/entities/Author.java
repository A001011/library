package com.example.library.entities;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Table(name = "Authors")
@Entity

public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column
    private Date birthday;
    @Column
    private String firstname;
    @Column
    private String lastname;
    @Column
    private String patronymic;
    public Author() {
    }

    public Author(Date birthday, String firstname, String lastname, String patronymic) {
        this.birthday = birthday;
        this.firstname = firstname;
        this.lastname = lastname;
        this.patronymic = patronymic;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return id == author.id &&
                Objects.equals(birthday, author.birthday) &&
                Objects.equals(firstname, author.firstname) &&
                Objects.equals(lastname, author.lastname) &&
                Objects.equals(patronymic, author.patronymic);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, birthday, firstname, lastname, patronymic);
    }

    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", birthday=" + birthday +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", patronymic='" + patronymic + '\'' +
                '}';
    }
}
