package ru.course;

import io.swagger.v3.oas.annotations.media.Schema;

import javax.persistence.*;

@Entity
@Table(name = "pg_order")
@Schema(name = "public")
public class Progress {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "percent_done")
   private char percentDone;

    @ManyToOne
    @JoinColumn(name = "lesson") // Поле в таблице прогресса, которое ссылается на урок
    private Lesson lesson;

    @ManyToOne
    @JoinColumn(name = "pg_user") // Поле в таблице прогресса, которое ссылается на пользователя
    private User user;

   public void setId(Long id) {
      this.id = id;
   }

   public Long getId() {
      return id;
   }

    public char getPercentDone() {
        return percentDone;
    }

    public void setPercentDone(char percentDone) {
        this.percentDone = percentDone;
    }


    public Lesson getLesson() {
        return lesson;
    }

    public void setLesson(Lesson lesson) {
        this.lesson = lesson;
    }
}
