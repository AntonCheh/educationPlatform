package ru.course;

import io.swagger.v3.oas.annotations.media.Schema;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "lesson")
@Schema(name = "public")
public class Lesson {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "Lesson")
    private char lesson;

    @Column(name = "describe")
    private String describe;

    @ManyToOne
    @JoinColumn(name = "pg_user") // Поле в таблице прогресса, которое ссылается на пользователя
    private User user;

    @ManyToOne
    @JoinColumn(name = "course_id") // Поле в таблице прогресса, которое ссылается на пользователя
    private Course course;

    @ManyToOne
    @JoinColumn(name = "material_id") // Поле в таблице прогресса, которое ссылается на пользователя
    private Material material;

    @OneToMany(mappedBy = "lesson")
    private List<Progress> progressList;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public char getLesson() {
        return lesson;
    }

    public void setLesson(char lesson) {
        this.lesson = lesson;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User User) {
    }

    public Material getMaterial() {
        return material;
    }

    public void setDifficulty(Material material) {
        this.material = material;
    }
}
