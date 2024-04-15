package ru.course;

import javax.persistence.*;

@Entity
@Table(name = "basket")
public class Basket {
    @Id
    private Long id;
    @ManyToOne(cascade = CascadeType.ALL)
    private User user;
    @OneToOne ( )
    private Course course;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

}
