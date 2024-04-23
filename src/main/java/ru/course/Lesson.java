package ru.course;

import io.swagger.v3.oas.annotations.media.Schema;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "lesson")
@Schema(name = "public")
public class Lesson {

    @Id
    private Long id;

   @Column (name = "Lesson")
   private char lesson;

   @Column(name = "describe")
   private String describe;

   @Column (name = "pg_user")
   private int pgUser;

   @Column(name = "difficulty")
   private int difficulty;

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

   public int getPgUser() {
      return pgUser;
   }

   public void setPgUser(int pgUser) {
      this.pgUser = pgUser;
   }

   public int getDifficulty() {
      return difficulty;
   }

   public void setDifficulty(int difficulty) {
      this.difficulty = difficulty;
   }
}
