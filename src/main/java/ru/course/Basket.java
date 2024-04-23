package ru.course;

import io.swagger.v3.oas.annotations.media.Schema;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "basket")
@Schema(name = "public")
public class Basket {

    @Id
    private Long id;

    @OneToOne
    @JoinColumn(name = "pg_user") // Поле в таблице basket, которое ссылается на пользователя
    private User user;

    @Column(name = "course")
    private Course course;


    @ManyToMany
    @JoinTable(
            name = "basket_course",
            joinColumns = @JoinColumn(name = "basket_id"),
            inverseJoinColumns = @JoinColumn(name = "course_id")
    )
    private List<Course> courses;


    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
}


//Аннотация @ManyToMany указывает на то, что существует связь "многие ко многим" между двумя сущностями. В вашем случае это связь между сущностями Basket и Course, так как одна корзина может содержать несколько курсов, и каждый курс может быть в нескольких корзинах.
//
//Аннотация @JoinTable используется для определения таблицы связей, которая хранит отношения между сущностями. В данном случае создается таблица basket_course, которая будет хранить отношения между корзинами и курсами.
//
//        name = "basket_course" указывает на имя таблицы связей.
//        joinColumns = @JoinColumn(name = "basket_id") указывает на столбец, который будет содержать идентификатор корзины (basket_id).
//inverseJoinColumns = @JoinColumn(name = "course_id") указывает на столбец, который будет содержать идентификатор курса (course_id).
//        Таким образом, при использовании аннотации @ManyToMany с @JoinTable, вы определяете структуру таблицы связей, которая будет использоваться для хранения отношений между сущностями.
