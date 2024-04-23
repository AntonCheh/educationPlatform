package ru.course;

import io.swagger.v3.oas.annotations.media.Schema;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigInteger;
import java.time.LocalDateTime;

@Entity
@Table(name = "pg_order")
@Schema(name = "public")
public class Order {

    @Id
    private Long id;

    @Column(name = "price")
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

    public BigInteger getPrice() {
        return price;
    }

    public void setPrice(BigInteger price) {
        this.price = price;
    }

    public int getPgUser() {
        return pgUser;
    }

    public void setPgUser(int pgUser) {
        this.pgUser = pgUser;
    }

    public LocalDateTime getDatePurchase() {
        return datePurchase;
    }

    public void setDatePurchase(LocalDateTime datePurchase) {
        this.datePurchase = datePurchase;
    }
}
