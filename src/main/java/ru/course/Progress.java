package ru.course;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pg_order")
public class Progress {
    @Id
    private Long id;
    @Column(name = "percent_done")
   private char percentDone;
    @Column (name = "pg_user")
   private int pgUser;
   private int lesson;

   public void setId(Long id) {
      this.id = id;
   }

   public Long getId() {
      return id;
   }
}
