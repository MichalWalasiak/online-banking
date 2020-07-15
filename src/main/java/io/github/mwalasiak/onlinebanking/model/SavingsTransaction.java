package io.github.mwalasiak.onlinebanking.model;

import java.math.BigDecimal;
import java.util.Date;

public class SavingsTransaction {

    private Integer id;
    private Date date;
    private String description;
    private String type;
    private String status;
    private double amount;
    private BigDecimal availableBalance;

    private SavingsAccount savingsAccount;

}
