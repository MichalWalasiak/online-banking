package io.github.mwalasiak.onlinebanking.model;

import java.math.BigDecimal;
import java.util.List;

public class PrimaryAccount {

    private Integer id;
    private int accountNumber;
    private BigDecimal accountBalance;

    private List<PrimaryTransaction> primaryTransactionList;


}
