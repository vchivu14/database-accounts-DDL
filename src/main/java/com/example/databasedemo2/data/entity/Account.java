package com.example.databasedemo2.data.entity;

import javax.persistence.*;

@Entity
@Table(name="accounts")
public class Account {
    @Id
    @Column(name="account_number")
    private int accountNumber;
    @Column(name="account_description")
    private String accountDescription;

    @OneToOne(mappedBy = "account")
    private Vendor vendor;

    public Account() {
    }

    public Account(int accountNumber, String accountDescription) {
        this.accountNumber = accountNumber;
        this.accountDescription = accountDescription;
    }

    public Account(String accountDescription) {
        this.accountDescription = accountDescription;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountDescription() {
        return accountDescription;
    }

    public void setAccountDescription(String accountDescription) {
        this.accountDescription = accountDescription;
    }
}
