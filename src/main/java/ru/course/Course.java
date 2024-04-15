package ru.course;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "basket")
public class Course {
    @Id
    private Long id;
   private char name;
   private String describe;
   private char difficulty;
   private char duration;
   private Integer numeric;
   private boolean actuality;

   public void setId(Long id) {
      this.id = id;
   }

   public Long getId() {
      return id;
   }

   public char getName() {
      return name;
   }

   public void setName(char name) {
      this.name = name;
   }

   public String getDescribe() {
      return describe;
   }

   public void setDescribe(String describe) {
      this.describe = describe;
   }

   public char getDifficulty() {
      return difficulty;
   }

   public void setDifficulty(char difficulty) {
      this.difficulty = difficulty;
   }

   public char getDuration() {
      return duration;
   }

   public void setDuration(char duration) {
      this.duration = duration;
   }

   public Integer getNumeric() {
      return numeric;
   }

   public void setNumeric(Integer numeric) {
      this.numeric = numeric;
   }

   public boolean isActuality() {
      return actuality;
   }

   public void setActuality(boolean actuality) {
      this.actuality = actuality;
   }
}
