package io.github.mwalasiak.onlinebanking.model;

import java.math.BigDecimal;
import java.util.Date;

public class PrimaryTransaction {

    private Integer id;
    private Date date;
    private String description;
    private String type;
    private String status;
    private double amount;
    private BigDecimal availableBalance;

    private PrimaryAccount primaryAccount;

    public PrimaryTransaction() {
    }

    public PrimaryTransaction(final Date date, final String description, final String type, final String status, final double amount, final BigDecimal availableBalance, final PrimaryAccount primaryAccount) {
        this.date = date;
        this.description = description;
        this.type = type;
        this.status = status;
        this.amount = amount;
        this.availableBalance = availableBalance;
        this.primaryAccount = primaryAccount;
    }

    public Integer getId() {
        return id;
    }

    public void setId(final Integer id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(final Date date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(final String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(final String type) {
        this.type = type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(final String status) {
        this.status = status;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(final double amount) {
        this.amount = amount;
    }

    public BigDecimal getAvailableBalance() {
        return availableBalance;
    }

    public void setAvailableBalance(final BigDecimal availableBalance) {
        this.availableBalance = availableBalance;
    }

    public PrimaryAccount getPrimaryAccount() {
        return primaryAccount;
    }

    public void setPrimaryAccount(final PrimaryAccount primaryAccount) {
        this.primaryAccount = primaryAccount;
    }
}
