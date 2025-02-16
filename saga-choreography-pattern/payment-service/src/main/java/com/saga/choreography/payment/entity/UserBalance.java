package com.saga.choreography.payment.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbl_user_balance")
public class UserBalance {

    @Id
    private int userId;
    private int price;

    public UserBalance() {
    }

    public UserBalance(int userId, int price) {
        this.userId = userId;
        this.price = price;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
