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
}
