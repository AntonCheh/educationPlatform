package ru.course;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigInteger;
import java.time.LocalDateTime;

@Entity
@Table(name = "pg_order")
public class Order {
    @Id
    private Long id;
    private BigInteger price;
    @Column(name = "pg_user")
    private int pgUser;
    @Column(name = "date_purchase")
    private LocalDateTime datePurchase;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
