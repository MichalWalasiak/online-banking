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

    public PrimaryTransaction() {
    }
}
