package ru.course;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "lesson")
public class Lesson {
    @Id
    private Long id;
   private char lesson;
   private String describe;
   @Column (name = "pg_user")
   private int pgUser;
   private int difficulty;

   public void setId(Long id) {
      this.id = id;
   }

   public Long getId() {
      return id;
   }
}
