package ru.course;

import io.swagger.v3.oas.annotations.media.Schema;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "course")
@Schema(name = "public")
public class Course {
    @Id
    private Long id;

   @Column(name = "name")
   private char name;

   @Column(name = "describe")
   private String describe;

   @Column(name = "difficulty")
   private char difficulty;

   @Column(name = "duration")
   private char duration;

   @Column(name = "numeric")
   private Integer numeric;

   @Column(name = "actuality")
   private boolean actuality;

   @ManyToMany(mappedBy = "course")
   private Set<Basket> baskets;

   @OneToMany(mappedBy = "course", cascade = CascadeType.ALL)
   private List<Lesson> lessons;

    public Course(Set<Basket> baskets) {
        this.baskets = baskets;
    }

   public Course() {

   }

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

   public Set<Basket> getBaskets() {
      return baskets;
   }

   public void setBaskets(Set<Basket> baskets) {
      this.baskets = baskets;
   }
}
