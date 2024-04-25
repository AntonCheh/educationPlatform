package ru.course;

import io.swagger.v3.oas.annotations.media.Schema;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "user_pg")
@Schema(name = "public")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

    @Column(name = "mail")
    private char mail;

    @Column(name = "password")
    private char password;

    @Column(name = "status")
    private boolean status;

    @Column(name = "phone_number")
    private Integer phoneNumber;

    @Column(name = "role")
    private String role;

    @OneToOne(mappedBy = "pg_user", cascade = CascadeType.ALL)
    private Cart cart;

    @OneToMany(mappedBy = "pg_user", cascade = CascadeType.ALL)
    private List<Progress> progressList;

    @OneToMany(mappedBy = "pg_user", cascade = CascadeType.ALL)
    private List<Order> orders;

    @OneToMany(mappedBy = "pg_user", cascade = CascadeType.ALL)
    // Поле в таблице прогресса, которое ссылается на пользователя
    private Lesson lesson;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public char getMail() {
        return mail;
    }

    public void setMail(char mail) {
        this.mail = mail;
    }

    public char getPassword() {
        return password;
    }

    public void setPassword(char password) {
        this.password = password;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Integer phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
